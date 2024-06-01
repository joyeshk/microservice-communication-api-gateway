# Run Instructions
### start service registry
service registry is provided by spring cloud dependency. We will use it to name and identify microservices.
it starts on localhost:8761.

### start microService_1 and microService_2
these two services are the ones that holds actual APIs

### start apiGateway
apiGateway is the main endpoint that we need to call. It will automatically redirect our call to proper microServices using the URL path it received.

### verify service registry and api gateway
open localhost:8761 you should see all the microservices and api gateway listed in the spring Eureka UI. Open http://localhost:8083/api/ms1/getInfo. If yoy get a response then API Gateway is perfectly working.