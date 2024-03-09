package br.com.alura;

import br.com.alura.app.Menu;
import br.com.alura.repository.FabricanteRepository;
import br.com.alura.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FarmaciaApplication implements CommandLineRunner
{
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private FabricanteRepository fabricanteRepository;

    public FarmaciaApplication(ProdutoRepository produtoRepository, FabricanteRepository fabricanteRepository)
    {
        this.produtoRepository = produtoRepository;
        this.fabricanteRepository = fabricanteRepository;
    }

    public static void main(String[] args)
    {
        SpringApplication.run(FarmaciaApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception
    {
        Menu menu = new Menu(produtoRepository, fabricanteRepository);
        menu.exibirMenu();
    }
}
