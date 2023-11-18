# Projeto de Exemplo: Gerenciamento de Elementos Químicos

## Tecnologia Empregada

Este projeto utiliza as seguintes tecnologias:

- **Linguagem de Programação:** Java
- **Framework:** Spring Boot (com Spring Data JPA)
- **Banco de Dados:** SQL Server
- **Outras bibliotecas/frameworks:** Flyway (para controle de migração do banco de dados)

**Justificativa:** A escolha do Java e do ecossistema Spring foi feita devido à sua robustez, facilidade de desenvolvimento e vasta comunidade de suporte. O Spring Boot simplifica a configuração do projeto, enquanto o Spring Data JPA oferece facilidades para interação com o banco de dados de forma eficiente.

## Descrição da Arquitetura

A aplicação segue uma arquitetura MVC (Model-View-Controller), com as seguintes estruturas principais:
- `ElementoQuimico`: Representa a entidade mapeada para a tabela do banco de dados.
- `ElementoQuimicoRepository`: Interface estendida do Spring Data JPA para operações no banco de dados.
- `ElementoQuimicoController`: Controlador RESTful para manipulação dos recursos relacionados aos elementos químicos.

Esta arquitetura segue os princípios de Programação Orientada a Objetos, separando as responsabilidades entre as classes e facilitando a manutenção do código.

## Funcionalidades

O projeto implementa as operações CRUD (Create, Read, Update, Delete) para a entidade `ElementoQuimico`:
- **Create:** Adição de um novo elemento químico.
- **Read:** Listagem de todos os elementos químicos e busca por ID específico.
- **Update:** Atualização dos dados de um elemento químico existente.
- **Delete:** Remoção de um elemento químico.

A aplicação oferece endpoints RESTful para realizar essas operações, garantindo a funcionalidade completa do sistema CRUD.

## Inovação e Criatividade

Além das operações CRUD padrão, o projeto se destaca por:
- Utilização do Flyway para controle de migração do banco de dados.
- Estruturação de uma arquitetura MVC coesa e bem documentada.
