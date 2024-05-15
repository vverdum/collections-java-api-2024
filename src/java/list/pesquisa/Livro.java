package java.list.pesquisa;

public class Livro {
    // atributos
    private final String titulo;
    private final String autor;
    private final int anoPublicacao;
    // construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    // getter

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + this.titulo + '\'' +
                ", autor='" + this.autor + '\'' +
                ", anoPublicacao=" + this.anoPublicacao +
                '}';
    }
}
