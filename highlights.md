## Architecture
### Base Architecture
API call comes to API Gateway. API Gateway is a SpringBoot project; it matches the API path with existing configuration and sends down the request to intended microservice.

Eureka server (serviceRegistry project) is an underlying system that keeps note of all the microservices and the API gateway. While Eureka server is a standalone SpringBoot project, all the microservices and API gateway are configured as Eureka client. 

### Microservice to microservice call
Feign client

## Highlights
1. added module microservice_1 with 1 basic API 
2. added module microservice_2 with 1 basic API 
3. added module serviceRegistry - see highlights
4. configured existing microservices with eureka client - see highlights
5. added API Gateway Module - see highlights
6. added feign dependency to parent pom, spring-cloud-starter-openfeign

## Service Registry Server Highlights
1. added dependency with spring-cloud-starter-netflix-eureka-server 
2. added @EnableEurekaServer in main class 
3. added following properties
- spring.application.name=service-registry 
- server.port=8761 
- eureka.instance.hostname=localhost 
- eureka.client.fetch-registry=false 
- eureka.client.register-with-eureka=false
## Service Registry Client Highlights
1. added dependency spring-cloud-starter-netflix-eureka-client 
2. added following properties
- spring.application.name=microService1

## API Gateway Highlights
1. added dependency to module:spring-cloud-starter-gateway,spring-cloud-starter-netflix-eureka-client
2. added @EnableDiscoveryClient after @SpringBootApplication in main class
3. added basic routing to capture API calls to this gateway and redirect to proper load balancer or url
- spring.cloud.gateway.routes[0].id=ms1
- spring.cloud.gateway.routes[0].uri=lb://microservice1 
- #spring.cloud.gateway.routes[0].uri=http://localhost:8081
- spring.cloud.gateway.routes[0].predicates[0]=Path=/api/ms1/**
