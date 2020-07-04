1.currency-exchange-service:
http://localhost:8000/currency-exchange/from/USD/to/INR
2.currency-exchange-service via zuul-apiGateway
http://localhost:8765/currency-exchange-service/currency-exchange/from/USD/to/INR


1.currency-conversion:
http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/1000
2.currency-conversion-service via zuul-apiGateway
http://localhost:8765/currency-conversion-service/currency-conversion-feign/from/USD/to/INR/quantity/1000
zipkin:
SET RABBT_URI=amqp://localhost
java -jar zipkin-server-2.12.9-exec.jar