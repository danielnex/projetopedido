package br.senai.sc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.senai.sc.domain.Categoria;
import br.senai.sc.domain.Produto;
import br.senai.sc.repositores.CategoriaRepository;

@SpringBootApplication
public class ProjetoPedidoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPedidoApplication.class, args);
	}

	@Autowired
	private CategoriaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escristorio");


		Categoria p1 = new Categoria(null, "Computador", 200.00);
		Categoria p2 = new Categoria(null, "Impressora", 800.00);
			
		p1.getCategorias().add(cat1);
		cat1.getCategorias().add(cat1);
		
		categoriaRepository.save(cat1);		
		CategoriaRepository.save(cat2);
		
		ProdutoRepo
		repo.save(cat1);
		
		repo.save(cat2);
	}
}
