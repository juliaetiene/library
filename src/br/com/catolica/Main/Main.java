package br.com.catolica.Main;

import br.com.catolica.Model.*;

public class Main {
    public static void main(String [] args){

        Biblioteca novaB = new Biblioteca("Nome", "Rua alguma coisa");
        Professor professor = new Professor("janaina", 35, "kkdsajkdajksdjas", 5);
        Aluno aluno = new Aluno("robson", 98, "sdhasjdoiasjdioa", 6);
        Livro livroTeste = new Livro("Joao", "jun",65555, 2550, 3);
        Livro livroTeste1 = new Livro("maria", "jun",65555, 2550, 3);

        professor.setLivrosEmPosse(7);

        novaB.exibirInfo();
        novaB.adicionarLivro(livroTeste);
        novaB.adicionarLivro(livroTeste1);
        novaB.exibirInfo();
        novaB.listaLivrosDaBiblioteca();
        novaB.localizarTitulosPorNome("Joao");
        novaB.localizarTitulosPorAutor("jun");
        novaB.verificarDisponibilidade("maria");
        novaB.emprestar("maria", "jun");
        novaB.listaLivrosDaBiblioteca();
        novaB.emprestar("maria", "jun");
        novaB.listaLivrosDaBiblioteca();
        novaB.emprestar("Joao", "jun");
        novaB.listaLivrosDaBiblioteca();
        novaB.devolver("maria", "jun");
        novaB.listaLivrosDaBiblioteca();
    }
}
