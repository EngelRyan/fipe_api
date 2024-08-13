# BrasilAPI FIPE

Este projeto é um exercício para praticar o consumo de APIs públicas. Utiliza a API do BrasilAPI para consultar informações de veículos com base na tabela FIPE.

## 1. Como Executar o Projeto

### Clonando o Repositório

Para começar, clone o repositório usando o seguinte comando:

```bash
git clone https://github.com/EngelRyan/fipe_api.git
````

Executando o Projeto
Após clonar o repositório, navegue até o diretório do projeto:

Certifique-se de que você tenha as seguintes ferramentas instaladas:

Java: Necessário para compilar e rodar o projeto.<br>
Spring Boot: O projeto foi configurado usando o Spring Initializr.<br>
Maven: Para gerenciar as dependências e a execução do projeto.<br>

## 2. Requisitos
Java Development Kit (JDK) 21 ou superior.<br>
IDE com suporte ao Spring Boot (por exemplo, IntelliJ IDEA, Eclipse com Spring Tool Suite, ou Visual Studio Code com extensão Java).<br>

## 3. Rodando o Projeto
Dentro do diretório do projeto, você pode rodar a aplicação pela linha de comando usando Maven Wrapper:
```bash
./mvnw spring-boot:run
````
Se estiver usando uma IDE, localize a classe principal (a que possui o método main) e execute-a diretamente.

## 4. Endpoints da API
Este projeto consome a seguinte API pública:

Base URL: https://brasilapi.com.br/api/fipe/preco/v1/
Você pode realizar buscas usando o código FIPE dos veículos.

## 5. Contribuições
Se desejar contribuir para este projeto, sinta-se à vontade para fazer um fork e enviar pull requests. Para relatórios de bugs ou sugestões, por favor, crie uma nova issue no repositório.
