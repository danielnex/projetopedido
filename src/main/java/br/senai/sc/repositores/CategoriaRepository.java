package br.senai.sc.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.senai.sc.domain.Categoria;

@Repository
public interface CategoriaRepository extends  JpaRepository<Categoria,Integer>	{

	
}
