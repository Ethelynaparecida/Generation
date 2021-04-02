package br.com.ecommerce.ecommerce.controller;

import java.util.List;
import java.util.Optional;

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

import br.com.ecommerce.ecommerce.model.Produto;
import br.com.ecommerce.ecommerce.model.Usuario;
import br.com.ecommerce.ecommerce.repository.ProdutoRepository;


@RequestMapping("/produto")
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {

	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produto>> GetbyTitulo(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping("/valorMenor")
	public ResponseEntity<List<Produto>> getValoMenor(){
		return ResponseEntity.ok(repository.valorMenor());
	}
	
	@GetMapping("/valorEntre")
	public ResponseEntity<List<Produto>> getValorEntre(){
		return ResponseEntity.ok(repository.valorEntre());
	}
	@GetMapping("/valorMaior")
	public ResponseEntity<List<Produto>> getvalorMaior(){
		return ResponseEntity.ok(repository.valorMaior());
	}
	
	@GetMapping("/valormaior/{valor}")
	public ResponseEntity<List<Produto>> GetAllByPrecoMaior(@PathVariable Float valor){
		return ResponseEntity.ok(repository.findAllByValorGreaterThanEqual(valor));
	}
	
	@GetMapping("/valorMenor/{valor}")
	public ResponseEntity<List<Produto>> GetAllByPrecoLess(@PathVariable Float valor){
		return ResponseEntity.ok(repository.findAllByValorLessThanEqual(valor));
	
	}
	
	@PostMapping
	
	public ResponseEntity<Produto> post (@RequestBody Produto produto){
			
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
		
	@PutMapping
		
	public ResponseEntity<Produto> put (@RequestBody Produto produto){
			
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
	}

	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
}
