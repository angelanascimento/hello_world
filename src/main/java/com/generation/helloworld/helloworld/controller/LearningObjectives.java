package com.generation.helloworld.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learning-objectives")
public class LearningObjectives {
	
	@GetMapping
	public List<String> learningObjectives() {
		
		List<String> items = new ArrayList<>();
		
		items.add("Criar um Banco Relacional com MYSQL");
		items.add("Introdução ao SQL");
		items.add("SQL Avançado - Juntando Tabelas");
		items.add("Introdução ao Desenvolvimento Web Usando Java e Spring Boot");
		items.add("Fundamentos do Spring Framework (Criando novo Projeto)");
		
		return items;
	}

}
