package list.pesquisa;

/**
 * Atributos do objeto livro
 */
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    public Livro() {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    public Livro(String titulo, String autor, int anoPublicacao) {
    }
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
