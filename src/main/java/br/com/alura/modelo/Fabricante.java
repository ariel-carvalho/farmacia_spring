package br.com.alura.modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "fabricantes")
public class Fabricante
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @OneToMany(mappedBy = "fabricante")
    private List<Produto> produto;

    public List<Produto> getProdutos()
    {
        return produto;
    }

    public Fabricante(String nome)
    {
        this.nome = nome;
    }

    public Fabricante(){}

    public int getId()
    {
        return id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
}
