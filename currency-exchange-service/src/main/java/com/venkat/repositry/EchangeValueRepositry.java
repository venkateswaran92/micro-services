package com.venkat.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venkat.model.ExchangeValue;

public interface EchangeValueRepositry extends JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from,String to);
	
}
