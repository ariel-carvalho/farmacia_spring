package br.com.alura.repository;

import br.com.alura.modelo.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository<Produto, Integer>
{

}
