package br.com.example.exerciciosSB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.exerciciosSB.model.entities.Produto;
import br.com.example.exerciciosSB.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
   public @ResponseBody Produto novoProduto(Produto produto) {
	   produtoRepository.save(produto);
	   return produto;
   }
}
