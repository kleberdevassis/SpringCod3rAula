package br.com.example.exerciciosSB.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class primeiroController {

	@GetMapping(path = { "/ola", "/saudacao" })
	public String Ola() {
		return "Ola Spring Boots";
	}

}
