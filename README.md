# 📚 Sistema de Gerenciamento de Biblioteca

## Descrição
Este projeto é um sistema de gerenciamento de biblioteca desenvolvido em Java. O sistema permite o cadastro de livros, controle de disponibilidade, registro de empréstimos e devoluções de forma eficiente.

## Funcionalidades
- **Cadastro de Livros:** Adicione até 100 livros à biblioteca.
- **Verificação de Disponibilidade:** Consulte se um livro está disponível para empréstimo.
- **Empréstimos e Devoluções:** Registre empréstimos e devoluções, controlando a quantidade de livros disponíveis.
- **Busca de Livros:** Localize livros por título ou autor.
- **Limite de Empréstimos:** Usuários podem ter até 5 livros emprestados simultaneamente.

## Estrutura do Projeto

### Classes Principais
- **`Livro`**
  - **Atributos:** título, autor, ISBN, ano de publicação, quantidade em estoque.
  - **Métodos:** exibir informações, verificar disponibilidade, emprestar, devolver.

- **`Usuario`**
  - **Atributos:** nome, ID, e-mail, livros em posse.
  - **Métodos:** exibir informações, controlar limite de empréstimos.

- **`Biblioteca`**
  - **Atributos:** nome, endereço, lista de livros disponíveis.
  - **Métodos:** cadastrar livro, localizar livro por título ou autor, verificar disponibilidade.
