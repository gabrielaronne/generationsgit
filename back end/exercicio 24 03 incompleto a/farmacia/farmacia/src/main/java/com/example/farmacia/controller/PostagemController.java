package com.example.farmacia.controller; //responsavel pela comunicacao com o cliente (postiman,angular,etc)//


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.farmacia.model.PrimeirosSocorros;

import FarmaciaRepository.PrimeirosSocorrosRepository;



@RestController
@RequestMapping ("/postagens")
@CrossOrigin("*")
public class PostagemController {
	
	
	@Autowired
	private PrimeirosSocorrosRepository repository;
	
	@GetMapping
	public ResponseEntity<List<PrimeirosSocorros>> GetAll (){
		
		return ResponseEntity.ok(repository.findAll());
		
		
	}
	@GetMapping("/{id}")
	public ResponseEntity <PrimeirosSocorros> GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/titulo/{titulo}")
     public ResponseEntity<List<PrimeirosSocorros>> GetByTitulo(@PathVariable String titulo){
    	 return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
    	 
     }
	
	@PostMapping
	public ResponseEntity<PrimeirosSocorros> post (@RequestBody PrimeirosSocorros PrimeirosSocorros) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(PrimeirosSocorros));
		
	}

	@PutMapping
	public ResponseEntity<PrimeirosSocorros> put (@RequestBody PrimeirosSocorros PrimeirosSocorros) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(PrimeirosSocorros));
	}
	
	@DeleteMapping ("/{id}")
	public void delete (@PathVariable long id) {
	repository.deleteById(id);	
		
}
	
	
}