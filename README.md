# Spring Boot API Rest Java

## Descrição
Este projeto é uma API REST desenvolvida com Spring Boot em Java.

Ela vai fornercer uma interface para gerenciar recursos por meio de operações CRUD (Criar, Ler, Atualizar, Excluir).

No momento, a API esta em desenvolvimento e não possui funcionalidades específicas implementadas, mas a estrutura básica está configurada para facilitar a adição de novos recursos no futuro.

A API foi projetada para ser fácil de usar e pode ser integrada com outras aplicações ou serviços.

## Dependências
- Java 21.0.7
- Spring Boot 3.4.0
- Spring Boot DevTools
- Spring Web
- Spring Data JPA
- MySQL Connector/J

## Configuração de Banco de Dados

### MySQL Datasource

A aplicação foi configurada para utilizar o banco de dados MySQL com as seguintes características:

#### Dependências Adicionadas ao pom.xml
- **Spring Data JPA** (`spring-boot-starter-data-jpa`): Fornece support para ORM com Hibernate
- **MySQL Connector/J** (`mysql-connector-j`): Driver JDBC para conectar ao MySQL

#### Configuração do application.yml
O arquivo `application.yml` foi configurado com os seguintes parâmetros:

```yaml
spring:
  datasource:
    driverClassName: com.mysql.cj.jdbc.driver
    url: jdbc:mysql://localhost:3386/rest_with_spring_boot_java?useTimezone=true&serverTimezone=UTC
    username: root
    password: 12345678
  jpa:
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        dialect: org.hibernate.dialect.MySQL8Dialect
    show-sql: false
```

- **Driver**: Utiliza o driver MySQL 8.0 (`com.mysql.cj.jdbc.driver`)
- **URL**: Conecta ao banco de dados `rest_with_spring_boot_java` na porta 3386 do localhost
- **Hibernate DDL**: Configurado para `update`, o que permite que as tabelas sejam criadas/atualizadas automaticamente baseado nas entidades
- **Dialect**: MySQL8Dialect para máxima compatibilidade com MySQL 8.0+

> **Nota**: Certifique-se de que o servidor MySQL está rodando na porta 3386 e que o banco de dados `rest_with_spring_boot_java` existe no servidor.

## Funcionalidades Implementadas

### Gerenciamento de Pessoas (CRUD)

A API oferece um conjunto completo de operações para gerenciar entidades de Pessoa:

#### 1. **Criar Pessoa** (POST)
- Permite criar uma nova entidade de Pessoa no sistema
- Recebe os dados da pessoa e armazena no banco de dados

#### 2. **Listar Todas as Pessoas** (GET)
- Retorna uma lista com todas as pessoas cadastradas no sistema
- Útil para consultas gerais e relatórios

#### 3. **Buscar Pessoa por ID** (GET)
- Recupera uma pessoa específica usando seu identificador único
- Permite consultas direcionadas de um registro específico

#### 4. **Atualizar Pessoa** (PUT)
- Modifica os dados de uma pessoa existente
- Inclui métodos como `updatePerson()` no PersonController e PersonServices
- Permite alterar informações cadastrais da pessoa mantendo seu ID

#### 5. **Deletar Pessoa** (DELETE)
- Remove uma pessoa do sistema
- Inclui métodos como `deletePerson()` no PersonController e PersonServices
- Realiza a exclusão permanente da entidade

### Arquitetura

A aplicação segue uma arquitetura em camadas:
- **Controller**: PersonController gerencia as requisições HTTP
- **Services**: PersonServices contém a lógica de negócio
- **Model**: Classe Person define a estrutura de dados



## Conclusão
Este projeto é uma base sólida para o desenvolvimento de uma API RESTful com Spring Boot em Java. Ele oferece funcionalidades essenciais para o gerenciamento de pessoas e pode ser facilmente expandido para incluir recursos adicionais conforme necessário. A estrutura modular facilita a manutenção e a escalabilidade da aplicação.

## Autor
- [Gilberto Junior dos Santos](https://github.com/giljrsantos)
