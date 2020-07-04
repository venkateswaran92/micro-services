package com.venkat.restClient;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.venkat.model.Currency_ConversionBean;

//@FeignClient(name = "currency-conversion-service", url = "localhost:8000")
@RibbonClient(name = "currency-conversion-service")
//@FeignClient(name = "currency-conversion-service")
@FeignClient(name = "netflix-zuul-api-gateway-server")
public interface CurrencyConversionServiceProxy {

	//@GetMapping("/currency-exchange/from/{from}/to/{to}")
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public Currency_ConversionBean retriveExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to);

}
