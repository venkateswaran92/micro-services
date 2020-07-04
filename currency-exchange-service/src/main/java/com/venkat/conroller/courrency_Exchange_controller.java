package com.venkat.conroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.venkat.model.ExchangeValue;
import com.venkat.repositry.EchangeValueRepositry;

@RestController
public class courrency_Exchange_controller {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private EchangeValueRepositry exchangeValueRepositry;
	@Autowired
	private Environment env;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue value = exchangeValueRepositry.findByFromAndTo(from, to);
		value.setPort(Integer.valueOf(env.getProperty("local.server.port")));
		logger.info("{}" , value);
		return value;
	}

}
