package br.com.alura;

import br.com.alura.app.Crud;
import br.com.alura.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FarmaciaApplication implements CommandLineRunner
{
    @Autowired
    private ProdutoRepository repository;

    public FarmaciaApplication(ProdutoRepository repository)
    {
        this.repository = repository;
    }
    public static void main(String[] args)
    {
        SpringApplication.run(FarmaciaApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception
    {
        Crud crud = new Crud(repository);
        crud.exibirMenu();
    }
}
