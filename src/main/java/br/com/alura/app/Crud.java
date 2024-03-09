package br.com.alura.app;

import br.com.alura.modelo.Fabricante;
import br.com.alura.modelo.Produto;
import br.com.alura.repository.ProdutoRepository;

import java.util.Scanner;

public class Crud
{
    private static ProdutoRepository repository;

    public Crud(ProdutoRepository repository)
    {
        this.repository = repository;
    }

    public void exibirMenu()
    {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        var opcao = 0;

        while (opcao != 5) {
            var menu = ("""
                    FARMACIA - ESCOLHA UMA OPÇÃO:
                    1 - Cadastrar Produto
                    2 - Listar Produtos
                    3 - Editar produto
                    4 - Apagar produto
                    5 - Sair
                    """);

            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    salvar();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Finalizando a aplicação.");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public static void salvar()
    {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Digite o nome do produto:");
        String nome = scanner.next();

        System.out.println("Digite a descrição do produto:");
        String descricao = scanner.next();

        System.out.println("Digite o preço do produto");
        double preco = scanner.nextDouble();

        System.out.println("Digite o nome do fabricante:");
        String fabricante = scanner.next();

        Produto produto = new Produto(nome, descricao, preco, new Fabricante(fabricante));

        repository.save(produto);

        System.out.println("Produto cadastrado com sucesso!");
    }

}

