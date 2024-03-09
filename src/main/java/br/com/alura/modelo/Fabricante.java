package br.com.alura.modelo;

public class Fabricante
{
    private int id;
    private String nome;

    public Fabricante(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
