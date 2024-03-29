package br.com.alura.app;

import br.com.alura.modelo.Fabricante;
import br.com.alura.modelo.Produto;
import br.com.alura.repository.FabricanteRepository;
import br.com.alura.repository.ProdutoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu
{
    private static ProdutoRepository produtoRepository;
    private static FabricanteRepository fabricanteRepository;

    public Menu(ProdutoRepository produtoRepository, FabricanteRepository fabricanteRepository)
    {
        this.produtoRepository = produtoRepository;
        this.fabricanteRepository = fabricanteRepository;
    }

    public void exibirMenu()
    {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        var opcao = 0;

        while (opcao != 7) {
            var menu = ("""
                    FARMACIA - ESCOLHA UMA OPÇÃO:
                    1 - Cadastrar Fabricante
                    2 - Cadastrar Produto
                    3 - Listar Produtos
                    4 - Listar por ID
                    5 - Editar Descrição do Produto
                    6 - Apagar Produto
                    7 - Sair
                    """);

            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    salvarFabricante();
                    break;
                case 2:
                    salvarProduto();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    listarPorId();
                    break;
                case 5:
                    editar();
                    break;
                case 6:
                    deletar();
                    break;
                case 7:
                    System.out.println("Finalizando a aplicação.");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public void salvarFabricante()
    {
        System.out.println("Digite o nome do fabricante:");
        String nome = scanner.next();

        Fabricante fabricante = new Fabricante(nome);

        fabricanteRepository.save(fabricante);

        System.out.println("Fabricante cadastrado com sucesso!");
    }

    public void salvarProduto()
    {
        System.out.println("Digite o nome do produto:");
        String nome = scanner.next();

        System.out.println("Digite a descrição do produto:");
        String descricao = scanner.next();

        System.out.println("Digite o preço do produto");
        double preco = scanner.nextDouble();

        System.out.println("Digite o nome do fabricante:");
        String nomeFabricante = scanner.next();

        Fabricante fabricante = fabricanteRepository.findByNome(nomeFabricante);
        var fabricanteRecuperado = fabricante;

        Produto produto = new Produto(nome, descricao, preco, fabricanteRecuperado);

        produtoRepository.save(produto);

        System.out.println("Produto cadastrado com sucesso!");
    }

    public void listar()
    {
        List<Produto> produtos = new ArrayList<>();
        produtos = produtoRepository.findAll();
        produtos.forEach(System.out::println);
    }

    public int listarPorId()
    {
        System.out.println("Digite o ID do produto:");
        int id = scanner.nextInt();
        Produto produto = produtoRepository.findById(id);
        System.out.println(produto);
        return produto.getId();
    }

    public void editar()
    {
        System.out.println("Digite o ID do produto:");
        int id = scanner.nextInt();
        var produto = produtoRepository.findById(id);

        System.out.println("Digite a nova descrição:");
        String descricao = scanner.next();

        produto.setDescricao(descricao);

        produtoRepository.save(produto);

        System.out.println("Descrição atualizada!");
    }

    public void deletar()
    {
        System.out.println("Digite o ID do produto:");
        int id = scanner.nextInt();
        produtoRepository.deleteById(Integer.valueOf(id));
        System.out.println("Produto deletado!");
    }
}

