package br.com.ecommerce.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.ecommerce.ecommerce.model.Loja;
import br.com.ecommerce.ecommerce.model.Usuario;
import br.com.ecommerce.ecommerce.repository.LojaRepository;

public class LojaController {
	
	@Autowired
	private LojaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Loja>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Loja>> GetByTitulo(@PathVariable String nome){
		
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	
	public ResponseEntity<Loja> post (@RequestBody Loja loja){
			
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(loja));
	}
		
	@PutMapping
		
	public ResponseEntity<Loja> put (@RequestBody Loja loja){
			
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(loja));
	}

	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
}


