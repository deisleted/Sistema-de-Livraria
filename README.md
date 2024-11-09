
# Projeto de Gerenciamento de Biblioteca

Este projeto é um sistema simples de gerenciamento de biblioteca desenvolvido em Java, com funcionalidades básicas para gerenciar livros e autores, bem como registrar empréstimos. Este sistema foi projetado para fins educacionais e é uma ótima introdução ao uso de classes e objetos em Java.

## Estrutura do Projeto

O projeto segue a seguinte estrutura de pastas e arquivos:

```
biblioteca/
├── src/
│   ├── entities/
│   │   ├── Autor.java
│   │   ├── Biblioteca.java
│   │   ├── Livro.java
│   └── Main.java
└── README.md
```

- `entities/Autor.java` – Representa um autor com nome e data de nascimento.
- `entities/Livro.java` – Representa um livro com título, autor e status de disponibilidade.
- `entities/Biblioteca.java` – Gerencia a lista de livros e autores, e permite a realização de empréstimos.
- `Main.java` – Ponto de entrada do programa, onde são criados autores, livros e realizadas operações como listagem de livros disponíveis e empréstimos.

## Funcionalidades do Sistema

O sistema possui as seguintes funcionalidades principais:

### 1. Gerenciamento de Livros

- **Adicionar um novo livro**: Permite adicionar um livro com título e autor.
- **Listar todos os livros disponíveis**: Exibe apenas os livros que estão disponíveis para empréstimo.
- **Realizar empréstimo de um livro**: Permite selecionar um livro disponível e registrar um empréstimo.

### 2. Gerenciamento de Autores

- **Adicionar um novo autor**: Permite adicionar um autor com nome e data de nascimento.

## Instruções para Uso

### Pré-requisitos

- [Java Development Kit (JDK) 8+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Visual Studio Code](https://code.visualstudio.com/) ou outro editor de sua preferência.

### Compilação e Execução

1. Navegue até o diretório do projeto:

   ```bash
   cd biblioteca/src
   ```

2. Compile o projeto:

   ```bash
   javac Main.java
   ```

3. Execute o programa:

   ```bash
   java Main
   ```

### Exemplo de Uso

Ao executar o programa, você verá um menu com opções. Aqui está um exemplo de como utilizar o sistema:

1. **Adicionar autores e livros** – No código `Main.java`, criamos alguns autores e livros de exemplo.
2. **Listar livros disponíveis** – O programa exibirá todos os livros disponíveis.
3. **Realizar um empréstimo** – O programa pedirá o ID do livro que deseja emprestar e atualizará o status de disponibilidade.

## Código de Exemplo

Abaixo, um trecho do código para criação de um autor e um livro no `Main.java`:

```java
Autor autor1 = new Autor(1, "George Orwell", LocalDate.of(1903, 6, 25));
Livro livro1 = new Livro(1, "1984", autor1);
biblioteca.adicionarLivro(livro1);
```

Este código cria um autor chamado "George Orwell" e adiciona o livro "1984" à biblioteca.

## Expansões Futuras

Este projeto pode ser expandido para incluir as seguintes funcionalidades:

- **Devolução de Livros**: Registrar a devolução de um livro emprestado.
- **Histórico de Empréstimos**: Manter um registro de todos os empréstimos realizados.
- **Interface Gráfica (GUI)**: Desenvolver uma interface gráfica para facilitar o uso do sistema.

## Contribuição

Este é um projeto educacional, então sinta-se à vontade para contribuir com melhorias! Sugestões são bem-vindas.

## Licença

Este projeto é desenvolvido para fins educacionais e não possui uma licença específica.
