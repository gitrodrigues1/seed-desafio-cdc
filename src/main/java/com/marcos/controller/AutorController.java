package com.marcos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.model.Autor;
import com.marcos.service.AutorService;

@RestController
@RequestMapping("/api/autor")
public class AutorController {
	
	@Autowired
	private AutorService autorService;
	
	@PostMapping
	public void novoAutor(Autor autor) {
		
	}
}
