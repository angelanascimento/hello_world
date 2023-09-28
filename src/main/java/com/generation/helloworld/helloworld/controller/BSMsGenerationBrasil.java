package com.generation.helloworld.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms")
public class BSMsGenerationBrasil {
	
	@GetMapping
	public List<String> bsms() {
		
		List<String> items = new ArrayList<>();
		
		items.add("Responsabilidade Pessoal");
		items.add("Orientação ao Futuro");
		items.add("Mentalidade de Crescimento");
		items.add("Persistencia");
		items.add("Comunicação");
		items.add("Proatividade");
		items.add("Orietação ao Detalhe");
		items.add("Trabalho em Equipe");
		
		return items;
		
	}

}
