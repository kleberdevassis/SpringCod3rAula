package br.com.example.exerciciosSB.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class primeiroController {
	
	@RequestMapping
	public String Ola() {
		return "Ola Spring Boot";
	}

}
