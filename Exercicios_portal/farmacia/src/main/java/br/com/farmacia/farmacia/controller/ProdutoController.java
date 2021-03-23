package br.com.farmacia.farmacia.controller;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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

import br.com.farmacia.farmacia.model.Categoria;
import br.com.farmacia.farmacia.model.Produto;
import br.com.farmacia.farmacia.repository.CategoriaRepository;
import br.com.farmacia.farmacia.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins ="*",allowedHeaders="*")
public class ProdutoController {

	
	

		@Autowired
		private ProdutoRepository repository;
		
		@GetMapping
		public ResponseEntity<List<Produto>> GetAll(){
			return ResponseEntity.ok(repository.findAll());
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Produto> GetById (@PathVariable long id){
			return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
		}
		
		@GetMapping("/tipoCategoria/{tipo}")
		public ResponseEntity<List<Produto>> GetByTipo(@PathVariable String nome){
			
			return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
		}
		
		@GetMapping("/descricaoCategoria/{descricao}")
		public ResponseEntity<List<Produto>> GetByDescricao (@PathVariable String descricao){
			
			return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(descricao));
		}
		
		@PostMapping
			
		public ResponseEntity<Produto> post (@RequestBody Produto id){
				
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(id));
		}
			
		@PutMapping
			
		public ResponseEntity<Produto> put (@RequestBody Produto id){
				
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(id));
		}

		@DeleteMapping("/{id}")
		public void delete (@PathVariable long id) {
			repository.deleteById(id);
		}

}
