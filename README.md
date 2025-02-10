# Exercicio SQL 01

## Descrição
Este é um projeto Spring Boot que implementa um CRUD básico para a entidade **Aluno** utilizando **Spring Data JPA** e um banco de dados PostgreSQL.

## Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Spring Data JPA
- Lombok
- PostgreSQL

## Estrutura do Projeto

O projeto é dividido nas seguintes camadas:

- **Model:** Contém a entidade `Aluno` que representa a tabela no banco de dados.
- **Repository:** Interface que herda de `JpaRepository` para manipulação de dados.
- **Service:** Contém a lógica de negócio e comunicação com o repositório.
- **DTO:** Objeto de transferência de dados para `Aluno`.
- **Controller:** Camada de API REST que expõe os endpoints.
- **Application:** Classe principal para inicialização do Spring Boot.

## Endpoints da API

A API REST está disponível no caminho `/alunos` e oferece os seguintes endpoints:

### 1. Listar todos os alunos
- **URL:** `GET /alunos`
- **Resposta:** Lista de alunos cadastrados no banco.

### 2. Adicionar um novo aluno
- **URL:** `POST /alunos`
- **Corpo da Requisição:**
```json
{
  "nome": "João Silva",
  "idade": 20
}
```
- **Resposta:** Aluno cadastrado com sucesso.

## Como Executar o Projeto

1. Clone o repositório:
```sh
git clone https://github.com/seu-usuario/exercicio-sql-01.git
```

2. Acesse a pasta do projeto:
```sh
cd exercicio-sql-01
```

3. Configure o banco de dados PostgreSQL no `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

4. Compile e execute o projeto:
```sh
mvn spring-boot:run
```

5. Acesse os endpoints da API via Postman ou outra ferramenta.
