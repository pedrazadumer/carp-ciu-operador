# [Fines Académicos] Servicio Operador

### ¿Cómo probar?

* Subir el mockup del Servicio Operador 
```shell script
$ mvn clean package
$ mvn spring-boot:run
```

* Enviar peticiones de prueba
```shell script
$ curl -v -X POST http://localhost:8080/registrar-usuario-prueba
```