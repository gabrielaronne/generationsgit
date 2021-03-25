package generation.lojadegames.controller; //responsavel pela comunicacao com o cliente (postiman,angular,etc)//


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

import generation.lojadegames.repository.jogoscomputadorRepository;



@RestController
@RequestMapping ("/postagens")
@CrossOrigin("*")
public class jogoscomputadorController {
	
	
	@Autowired
	private jogoscomputadorRepository repository;
	
	@GetMapping
	public ResponseEntity<List<jogoscomputadorRepository>> GetAll (){
		
		return ResponseEntity.ok(repository.findAll());
		
		
	}
	@GetMapping("/{id}")
	public ResponseEntity <jogoscomputadorRepository> GetById(@PathVariable long id){
		return (ResponseEntity<jogoscomputadorRepository>) repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/nome_jogo/{nome_jogo}")
     public ResponseEntity<List<jogoscomputadorRepository>> GetByTitulo(@PathVariable String nome_jogo){
    	 return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(nome_jogo));
    	 
     }
	
	@PostMapping
	public ResponseEntity<Object> post (@RequestBody jogoscomputadorRepository jogoscomputador) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(jogoscomputador));
		
	}

	@PutMapping
	public ResponseEntity<Object> put (@RequestBody jogoscomputadorRepository jogosdecomputador) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(jogosdecomputador));
	}
	
	@DeleteMapping ("/{id}")
	public void delete (@PathVariable long id) {
	repository.deleteById(id);	
		
}
	
	
}
