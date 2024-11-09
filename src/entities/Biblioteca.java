package entities;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Autor> autores;

    public Biblioteca(){
        this.livros = new ArrayList<>();
        this.autores = new ArrayList<>();
    }


    public void adicionarAutor(Autor autor){    
        autores.add(autor);
    }

    public void adiconarLivro(Livro livro){
        livros.add(livro);
    }



    public void listarLivrosDisponiveis(){
        for(Livro livro : livros){
            if(livro.isDisponivel()){
                System.out.printf("ID: %d, Título: %s, Autor: %s%n", livro.getId(), livro.getTitulo(), livro.getAutor());
            }
        }
    }

    
    public void emprestarLivro(int idLivro) {
        for (Livro livro : livros) {
            if (livro.getId() == idLivro && livro.isDisponivel()) {
                livro.setDisponivel(false);
                System.out.println("Empréstimo realizado para o livro: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Livro não disponível para empréstimo ou não encontrado.");
    }
}

 
 