# Projeto de Exemplo: Gerenciamento de Elementos Químicos
# Sistema de Gerenciamento de Elementos Químicos

## Descrição do Projeto

O projeto consiste em um sistema de gerenciamento de elementos químicos desenvolvido como parte do componente curricular de `Programação Orientada a Objetos(POO)`. A aplicação oferece funcionalidades de CRUD (Create, Read, Update, Delete) para manipulação de informações sobre elementos químicos.

### Propósito da Aplicação

O objetivo central é proporcionar uma API eficiente para o gerenciamento de informações sobre elementos químicos. A aplicação possibilita a criação, leitura, atualização e remoção desses elementos, visando facilitar o controle e a manipulação desses dados de forma organizada e sistemática.

### Principais Recursos Implementados

- **Operações CRUD:** Funcionalidades completas de criação, leitura, atualização e exclusão de elementos químicos.
- **Armazenamento de Dados:** Utilização de um banco de dados SQL Server para persistência das informações.
- **Padrões de Orientação a Objetos:** Utilização de conceitos de Programação Orientada a Objetos para estruturar o código de forma eficiente.
- **Documentação Clara:** Comentários explicativos e documentação relevante no código para facilitar a compreensão e manutenção do projeto.

 O projeto concentra-se em oferecer um ambiente intuitivo e funcional para gerenciar elementos químicos, aplicando os princípios de Orientação a Objetos e garantindo uma experiência eficiente para seus usuários.

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

# Documentação das Rotas

## Listar Todos Elementos Químicos

- **Request:** `GET /api/elementosquimicos`
- **Resposta de Sucesso:** Retorna uma lista de todos os elementos químicos existentes.

## Buscar Elemento Químico por ID

- **Request:** `GET /api/elementosquimicos/{id}`
- **Resposta de Sucesso:** Retorna o elemento químico correspondente ao ID especificado.

## Adicionar Novo Elemento Químico

- **Request:** `POST /api/elementosquimicos`
- **Corpo da Requisição:**
  ```json
  {
    "simbolo": "H",
    "nome": "Hidrogênio",
    "numeroAtomico": 1,
    "massaAtomica": 1.008,
    "grupo": "1A",
    "periodo": "1"
  }

## Atualizar Elemento Químico

- **Request:** `PUT /api/elementosquimicos/{id}`
- **Corpo da Requisição:**
  ```json
  {
    "simbolo": "He",
    "nome": "Hélio",
    "numeroAtomico": 2,
    "massaAtomica": 4.0026,
    "grupo": "18",
    "periodo": "1"
  }

## Remover Elemento Químico

- **Request:** `DELETE /api/elementosquimicos/{id}`
- **Resposta de Sucesso:** Retorna uma resposta sem conteúdo (204 No Content) indicando que o elemento químico foi removido com sucesso.

## Inovação e Criatividade

Além das operações CRUD padrão, o projeto se destaca por:
- Utilização do Flyway para controle de migração do banco de dados.
- Estruturação de uma arquitetura MVC coesa e bem documentada.
