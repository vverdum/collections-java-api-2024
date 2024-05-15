package list.pesquisa;

public class Livro {
    // atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    // construtor
    public Livro(final String titulo, final String autor, final int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    // getter

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
