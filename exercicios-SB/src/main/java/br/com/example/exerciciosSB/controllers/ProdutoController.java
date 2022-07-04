package br.com.example.exerciciosSB.controllers;

import javax.validation.Valid;
import java.lang.Iterable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(method = {RequestMethod.POST,RequestMethod.PUT} )
   public @ResponseBody Produto novoProduto(@Valid Produto produto) { // @Valid uma notation que valida para que o produto esteja aderente as regras
	   produtoRepository.save(produto);
	   return produto;
	   
	}
	@GetMapping
	public Iterable<Produto> obterProdutos(){
		return produtoRepository.findAll();
	}
	@GetMapping(path="/{id}")   
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {//PathVariable uma variavel que esta presente no Path da aplicação
		return produtoRepository.findById(id);
	}
	
	/*@PutMapping
	public Produto alterarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;*/
	}
   
   

