package com.helloWord.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	 @GetMapping("/hello")
	    public String helloWorld() {
	        return "Hello World!";
	    }
	 
	 @GetMapping("/bsms")
	    public String listBSMs() {
	        return "BSMs da Generation Brasil:\n" +
	                "Mentalidade de Crescimento, \n" +
	                "Orientação ao futuro, \n" +
	                "Persistência, \n" +
	                "Comunicação, \n" +
	                "Atenção aos detalhes, \n" +
	                "Trabalho em equipe, \n" +
	                "Persistência, ";
	    }
	 
	    @GetMapping("/objetivos")
	    public String listObjetivos() {
	        return "Objetivos de aprendizagem desta semana:\n" +
	                "1. Organização macro de projetos Java" +
	                "2. Injeção de depedências" +
	                "3. CRUD";
	    }

}
