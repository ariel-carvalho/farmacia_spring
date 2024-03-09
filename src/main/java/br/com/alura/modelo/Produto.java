package br.com.alura.modelo;

public class Produto
{
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private Fabricante fabricante;

    public Produto(String nome, String descricao, double preco, Fabricante fabricante)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.fabricante = fabricante;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

}


