package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    //attribute
    private  List<Livro>livrosList;

    public CatalogoLivros() {
        livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

     public List<Livro> pesquisarPorAutor( String autor) {
        List<Livro>livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for ( Livro l: this.livrosList){

                if(autor.equalsIgnoreCase(l.getAutor())){
                    livrosPorAutor.add(l);
                }
            }

        }return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos( int anoInicial,  int anoFinal) {
         List<Livro>livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for( Livro l: this.livrosList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisaPorTitulo(final String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for( Livro l: this.livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }return livroPorTitulo;
    }

    public static void main( String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1","Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1","Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2","Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3","Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4","Autor 4", 2024);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
    }

}
