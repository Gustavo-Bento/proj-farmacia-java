# API de Farmácia

Esta é uma API RESTful desenvolvida para gerenciar operações básicas de uma farmácia, como cadastro, atualização, consulta e exclusão de itens de estoque.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- MySQL

## Configuração do Ambiente de Desenvolvimento

Para executar o projeto localmente, certifique-se de ter as seguintes ferramentas instaladas:

- JDK 1.8 ou superior
- Maven
- MySQL

### Passos para Execução:

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/seu-usuario/projeto-farmacia.git
   cd projeto-farmacia
    ```
2. **Configuração do Banco de Dados:**

Crie um banco de dados MySQL chamado farmacia_db.

Configure as credenciais de acesso ao banco de dados no arquivo application.properties:

~~~properties
spring.datasource.url=jdbc:mysql://localhost:3306/farmacia_db
spring.datasource.username=root
spring.datasource.password=root
~~~

3. **Executar a Aplicação:**

Execute o seguinte comando Maven para compilar e executar a aplicação:

~~~bash
mvn spring-boot:run
~~~

4. **Acessando a API:**

A API estará acessível em http://localhost:8080/api/items. Você pode usar ferramentas como Postman ou cURL para interagir com os endpoints.

Endpoints Disponíveis
* GET /api/items: Retorna todos os itens no estoque.

* GET /api/items/{id}: Retorna um item específico pelo seu ID.

* POST /api/items: Cria um novo item no estoque.

Exemplo de corpo da requisição (JSON):

~~~json

{
  "name": "Paracetamol",
  "description": "Analgésico e antipirético",
  "quantity": 100,
  "price": 10.5
}
~~~

* PUT /api/items/{id}: Atualiza um item existente no estoque.

Exemplo de corpo da requisição (JSON):
~~~json
{
  "name": "Paracetamol",
  "description": "Analgésico e antipirético",
  "quantity": 120,
  "price": 10.5
}
~~~
* DELETE /api/items/{id}: Remove um item do estoque pelo seu ID.

### Contribuindo
Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request com melhorias ou correções.

### Licença
Este projeto está licenciado sob a MIT License.