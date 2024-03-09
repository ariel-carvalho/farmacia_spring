package br.com.alura.repository;

import br.com.alura.modelo.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProdutoRepository extends JpaRepository<Produto, Integer>
{
    Produto findById(int id);
}
