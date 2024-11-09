import entities.Autor;
import entities.Biblioteca;
import entities.Livro;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Criando e adicionando autores e livros
        Autor autor1 = new Autor(1, "George Orwell", LocalDate.of(1903, 6, 25));
        Livro livro1 = new Livro(1, "1984", autor1);
        biblioteca.adicionarAutor(autor1);
        biblioteca.adiconarLivro(livro1); 

        Autor autor2 = new Autor(2, "Aldous Huxley", LocalDate.of(1894, 7, 26));
        Livro livro2 = new Livro(2, "Brave New World", autor2);
        biblioteca.adicionarAutor(autor2);
        biblioteca.adiconarLivro(livro2);

        // Listar livros disponíveis
        biblioteca.listarLivrosDisponiveis();

        // Realizar um empréstimo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID do livro que deseja emprestar: ");
        int idLivro = scanner.nextInt();
        biblioteca.emprestarLivro(idLivro);

        // Listar livros disponíveis após o empréstimo
        biblioteca.listarLivrosDisponiveis();

        scanner.close();
    }
}
