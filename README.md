# micro-services
spring-boot-micro-services

1.Currency Converter Service - Direct Call

    http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10000

2.Currency Converter Service - Direct Call using Feign	

    http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10000

3.Currency Exchange Service:

    http://localhost:8000/currency-exchange/from/USD/to/INR 
    LoadBalancer:
    http://localhost:8001/currency-exchange/from/USD/to/INR

4.Eureka
	
    http://localhost:8761/

5.Zuul - Currency Exchange & Exchange Services

	http://localhost:8765/currency-exchange-service/currency-exchange/from/USD/to/INR
    http://localhost:8765/currency-conversion-service/currency-conversion-feign/from/USD/to/INR/quantity/10

6.Zipkin

    http://localhost:9411/zipkin/
	
Run server:
set RABBIT_URI=amqp://localhost
java -jar zipkin-server-2.7.0-exec.jar

7. Run rabbit-Mq server

1.Spring Cloud Bus Refresh

    http://localhost:8080/actuator/bus-refresh (POST)
	
	Limits Service	
    http://localhost:8080/limits
    http://localhost:8080/actuator/refresh (POST)

2.Spring Cloud Config Server

	http://localhost:8888/limits-service/default
	http://localhost:8888/limits-service/dev
	
	
	
	
