package br.com.example.exerciciosSB.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.example.exerciciosSB.model.entities.Produto;

public interface ProdutoRepository 
extends PagingAndSortingRepository<Produto, Integer>{
	

}
