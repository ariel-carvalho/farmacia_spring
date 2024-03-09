package br.com.alura.repository;

import br.com.alura.modelo.Fabricante;
import br.com.alura.modelo.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FabricanteRepository extends JpaRepository<Fabricante, Integer>
{
    Fabricante findByNome(String nome);
}
