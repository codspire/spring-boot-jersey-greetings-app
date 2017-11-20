## Simple Spring Boot Greetings App Using Gradle Multi Project

### Build
```sh
./gradlew clean build
```
### Run
```sh
java -jar services/hello-service/build/libs/hello-service-0.0.1-SNAPSHOT.jar
```
### Test 1: Endpoint Without Parameter
```sh
curl -sb -H http://localhost:8090/api/v1/greeting/hello 
```
#### Output
```javascript
{"message":"Hello","responseTime":1511150204373}
```
### Test 2: Endpoint With Parameter
```sh
curl -sb -H http://localhost:8090/api/v1/greeting/hello/rakesh 
```
#### Output
```javascript
{"message":"Hello Rakesh","responseTime":1511150257287}
```


### Actuator Endpoints
```javascript
http://localhost:8091/beans
http://localhost:8091/metrics
http://localhost:8091/info

More Details: https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html
```

