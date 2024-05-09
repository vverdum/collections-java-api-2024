package main.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

class CarrinhoDeCompras {

    //atributos
    private List<Item> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itens.add(item);
    }

    public void removerItem(String nome) {
        itens.removeIf(item -> item.getNome().equals(nome));
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        for (Item item : itens) {
            System.out.println("Nome: " + item.getNome() +
                    ", Preço: " + item.getPreco() +
                    ", Quantidade: " + item.getQuantidade());
        }
    }
}

class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Camiseta", 29.99, 2);
        carrinho.adicionarItem("Camiseta A", 29.99, 2);
        carrinho.adicionarItem("Camiseta B", 29.99, 2);
        //carrinho.adicionarItem("Tênis", 199.99, 1);
        //carrinho.removerItem("Tênis");
        //carrinho.removerItem("Camiseta");
        carrinho.exibirItens();
        double total = carrinho.calcularValorTotal();
        if (total == 0) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Total: " + total);
        }



    }
}


