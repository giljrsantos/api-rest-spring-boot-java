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
