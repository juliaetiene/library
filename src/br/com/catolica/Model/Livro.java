package br.com.catolica.Model;

public class  Livro {
    private String titulo;
    private String autor;
    private int isbn;
    private int anoPublicacao;
    private int quantidadeEmEstoque;



    public Livro(String titulo, String autor, int isbn, int anoPublicacao, int quantidadeEmEstoque){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Getters
    public int getIsbn() {
        return isbn;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }



    // Setters

    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }


    public void setIsbn(int isbn) {
     this.isbn = isbn;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;

    }

    // Métodos
    public void exibirInfo(){
        System.out.printf("\n<Titulo = %s> <Autor = %s> <ID = %d> <Ano de publicação = %d> <Unidades disponiveis = %d>",
                this.titulo,this.autor,this.isbn, this.anoPublicacao,this.quantidadeEmEstoque);
    }
}

