package br.com.example.exerciciosSB.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.entities.cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/qualquer")
	public cliente obterCliente() {
		return new cliente(28, "Pedro", "123.456.789-00");
	}
	@GetMapping("/{id}")// id entre chaves para indicar que é um id variavel
	public cliente obterClientePorId1(@PathVariable int id){ // PathVariable caminho da variavel
		return new cliente(id,"Maria", "987.654.321.00");
	}
	
	@GetMapping
	public cliente obterClientePorId2(
			@RequestParam(name = "id", defaultValue = "1")int id){//parametro para definição do id as ser visualizado caso o usuario não passe nada o valor padrao vai ser 1
		return new cliente(id,"João Augusto", "111.222.333-44");
	}

}
