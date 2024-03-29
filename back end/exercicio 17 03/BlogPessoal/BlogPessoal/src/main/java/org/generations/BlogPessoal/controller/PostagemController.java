package org.generations.BlogPessoal.controller; //responsavel pela comunicacao com o cliente (postiman,angular,etc)//


import java.util.List;

import org.generations.BlogPessoal.model.Postagem;
import org.generations.BlogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping ("/postagens")
@CrossOrigin("*")
public class PostagemController {
	
	
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll (){
		
		return ResponseEntity.ok(repository.findAll());
		
		
	}
	@GetMapping("/{id}")
	public ResponseEntity <Postagem> GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/titulo/{titulo}")
     public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
    	 return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
    	 
     }
	
	
	
	

}
