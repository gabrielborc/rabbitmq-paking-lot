# Parking Lot

## Requisistos

- Java 11
- Docker 

## Executar

Primeiramente rode o comando no seu terminal para subir o RabbitMQ: 

```
$  docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management
```

O RabbitMQ vai estar disponível em http://localhost:15672/, a senha e o usuário é a padrão ```usuário: guest, senha: guest```

Agora rode o projeto spring para testar, com o comando no terminal na pasta raiz do projeto:

``` 
$ ./mwnw clean spring-boot:run
```

Então no terminal teste o projeto usando o curl:

``` 
$ curl http://localhost:8080/messages/send
```


