## Build
Generate a gradle wrapper for your project:

```bash
$ mvn clean install
```

## Run project

Before to run, you need to set dev profile for dev environment.

```bash
$ export SPRING_PROFILES_ACTIVE=dev
```

Run the application

```bash
$ java -Dspring.profiles.active=dev -jar target/positiva-prueba-jenkins-app.jar
```

## See swager ui

open in browser
```
http://localhost:8082/jenkins-test/swagger-ui/index.html
```

Service
```
http://localhost:8082/jenkins-test/prueba/consultar-texto
```
