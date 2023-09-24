# Gerador de Números

O Gerador de Números é um projeto que permite gerar números aleatórios e salvar os números já gerados em um banco de dados H2 embutido. Isso é útil para diversas aplicações, como sorteios, geração de senhas temporárias e muito mais.

## Funcionalidades

- Geração de números aleatórios dentro de um intervalo específico.
- Armazenamento seguro dos números gerados em um banco de dados H2 embutido.


## Configuração do Banco de Dados H2

O projeto utiliza um banco de dados H2 embutido para armazenar os números gerados. O banco de dados será criado automaticamente na inicialização do aplicativo. Você pode configurar as propriedades do banco de dados no arquivo `application.properties`.

```properties
# Configurações do banco de dados H2
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password= 
# H2 CLIENT 
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
# JPA, SQL 
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
#Thymeleaf
spring.thymeleaf.enabled=true
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.htmle
```

# Preview
![Animação](https://github.com/MiguelNunes3344/NumberGenerator/blob/main/src/main/resources/static/gifExample.gif)
