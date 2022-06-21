package model.entities.repositories;

import org.springframework.data.repository.CrudRepository;

import model.entities.Produto;

public interface ProdutoRepository 
extends CrudRepository<Produto, Integer>{
	

}
