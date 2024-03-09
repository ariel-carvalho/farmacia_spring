package br.com.alura.repository;

import br.com.alura.modelo.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FabricanteRepository extends JpaRepository<Fabricante, Integer>
{

}
