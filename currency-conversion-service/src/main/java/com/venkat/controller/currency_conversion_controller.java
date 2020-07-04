package com.venkat.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.venkat.model.Currency_ConversionBean;
import com.venkat.restClient.CurrencyConversionServiceProxy;

@RestController
public class currency_conversion_controller {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private CurrencyConversionServiceProxy proxy;

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public Currency_ConversionBean getCurrencyConversion(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		Map<String, String> mapValues = new HashMap<>();
		mapValues.put("from", from);
		mapValues.put("to", to);
		ResponseEntity<Currency_ConversionBean> responseEntity = restTemplate.getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", Currency_ConversionBean.class,
				mapValues);

		Currency_ConversionBean response = responseEntity.getBody();

		logger.info("{}",response);
		return new Currency_ConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
				quantity.multiply(response.getConversionMultiple()), response.getPort());
	}

	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public Currency_ConversionBean getCurrencyConversion_feign(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		Currency_ConversionBean response = proxy.retriveExchangeValue(from, to);

		return new Currency_ConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
				quantity.multiply(response.getConversionMultiple()), response.getPort());
	}

}
