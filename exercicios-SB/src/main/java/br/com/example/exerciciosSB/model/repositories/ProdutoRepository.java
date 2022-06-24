package br.com.example.exerciciosSB.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.example.exerciciosSB.model.entities.Produto;

public interface ProdutoRepository 
extends CrudRepository<Produto, Integer>{
	

}
