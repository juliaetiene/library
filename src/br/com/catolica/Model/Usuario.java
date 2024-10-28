package br.com.catolica.Model;

public abstract class Usuario {
    private String nome;
    private int id;
    private String email;
    protected int livrosEmPosse;

    public Usuario(String nome, int id, String email, int livrosEmPosse) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        setLivrosEmPosse(livrosEmPosse);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public int getLivrosEmPosse() {
        return livrosEmPosse;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLivrosEmPosse(int quantidade) {
        if (quantidade >= 0 && quantidade <= 5) {
            this.livrosEmPosse = quantidade;
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    // Métodos
    public void exibirInfoUsuario() {
        System.out.printf("\n<Nome = %s> <ID = %d> <Email = %s> <Livros em posse = %d>\n",
                this.nome, this.id, this.email, this.livrosEmPosse);
    }
}
