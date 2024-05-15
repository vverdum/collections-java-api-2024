package java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private final List<Livro>livroList;
    // construtor
    public CatalogoLivros() {
        livroList = new ArrayList<>();
    }
    //implementando metodos

    public void adicionarLivro(final String titulo, final String autor, final int anoPublicacao){
        this.livroList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(final String autor) {
        final List<Livro>livrosPorAutor = new ArrayList<>();
        if(!this.livroList.isEmpty()){
            for(final Livro l: this.livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(final int anoInicial, final int anoFinal){
        final List<Livro>livrosPorIntervaloAnos = new ArrayList<>();
        if(!this.livroList.isEmpty()){
            for(final Livro l: this.livroList){
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(final String titulo){
         Livro livroPorTitulo = null;
        if(!this.livroList.isEmpty()){
            for(final Livro l: this.livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(final String[] args) {
        final CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
    }
}
