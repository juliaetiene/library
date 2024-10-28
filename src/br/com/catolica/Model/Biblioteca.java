package br.com.catolica.Model;
import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    protected ArrayList<Livro> listaLivrosDisponiveis;

    public Biblioteca(String nomeObj, String enderecoObj){
        this.nome = nomeObj;
        this.endereco = enderecoObj;
        this.listaLivrosDisponiveis = new ArrayList<>();
    }

    public void verificarDisponibilidade(String titulo){
        boolean encontrado = false;
        for(Livro livro : listaLivrosDisponiveis){
            if(livro.getTitulo().equals(titulo)){
                encontrado = true;
                if(livro.getQuantidadeEmEstoque() > 0){
                    System.out.println("Livro disponível para alugar!");
                } else {
                    System.out.println("Livro indisponível para alugar");
                }
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Livro não encontrado");
        }
    }

    public void adicionarLivro(Livro livro){
        listaLivrosDisponiveis.add(livro);
    }

    public void listaLivrosDaBiblioteca(){
        for(Livro livro : listaLivrosDisponiveis){
            System.out.printf("\nTítulo: %s\nAutor: %s\nEm estoque: %d",
                    livro.getTitulo(), livro.getAutor(), livro.getQuantidadeEmEstoque());
        }
    }

    public void localizarTitulosPorNome(String titulo){
        boolean encontrado = false;
        for(Livro livro : listaLivrosDisponiveis){
            if(livro.getTitulo().equals(titulo)){
                System.out.println("\nLivro encontrado");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\nLivro não encontrado");
        }
    }

    public void localizarTitulosPorAutor(String autor){
        boolean encontrado = false;
        for(Livro livro : listaLivrosDisponiveis){
            if(livro.getAutor().equals(autor)){
                System.out.printf("Livro: %s, Autor: %s\n", livro.getTitulo(), livro.getAutor());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("\nAutor não encontrado\n");
        }
    }

    public void emprestar(String titulo, String autor){
        boolean encontrado = false;
        for(Livro livro : listaLivrosDisponiveis){
            if(livro.getTitulo().equals(titulo) && livro.getAutor().equals(autor)){
                encontrado = true;
                if(livro.getQuantidadeEmEstoque() > 0) {
                    livro.setQuantidadeEmEstoque(livro.getQuantidadeEmEstoque() - 1);
                    System.out.println("\nEmprestado com sucesso!");
                } else {
                    System.out.println("\nLivro indisponível para empréstimo");
                }
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\nLivro inválido");
        }
    }

    public void devolver(String titulo, String autor){
        boolean encontrado = false;
        for(Livro livro : listaLivrosDisponiveis){
            if(livro.getTitulo().equals(titulo) && livro.getAutor().equals(autor)){
                encontrado = true;
                livro.setQuantidadeEmEstoque(livro.getQuantidadeEmEstoque() + 1);
                System.out.println("\nDevolvido com sucesso!");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\nLivro inválido para devolução");
        }
    }

    public void exibirInfo() {
        System.out.printf("Nome: %s\nEndereço: %s\nTotal de Livros Disponíveis: %d\n",
                nome, endereco, listaLivrosDisponiveis.size());
    }
}
