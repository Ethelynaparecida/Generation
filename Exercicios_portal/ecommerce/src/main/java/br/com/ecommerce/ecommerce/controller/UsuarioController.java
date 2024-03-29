package br.com.ecommerce.ecommerce.controller;

import java.util.List;

import javax.validation.Valid;


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
import br.com.ecommerce.ecommerce.repository.UsuarioRepository;
import br.com.ecommerce.ecommerce.service.UsuarioService;

@RequestMapping("/usuario")
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	@Autowired
	private UsuarioService service;
	
	@PostMapping("/cadastro")
	public ResponseEntity<Usuario> cadastro(@Valid @RequestBody Usuario novoUsuario){
		return new ResponseEntity<Usuario>(service.cadastroUsuario(novoUsuario),HttpStatus.CREATED);
	}

	@PostMapping("/novoProduto/{id}")
	public ResponseEntity<?> novoProduto(@PathVariable(value = "id") Long idUsuario,
			@Valid @RequestBody Produto novoProduto
			){
		Produto cadastro = service.cadastrarProduto(novoProduto, idUsuario);
		if(cadastro ==null) {
			return new ResponseEntity<String>("Flaha no cadasrto do produto", HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Produto> (cadastro, HttpStatus.CREATED);
	}
	
	
	@GetMapping
	public ResponseEntity<List<Usuario>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> GetById (@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Usuario>> GetByTitulo(@PathVariable String nome){
		
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	@GetMapping("/email/{email}")
	public ResponseEntity<List<Usuario>> GetByEmail(@PathVariable String email){
		
		return ResponseEntity.ok(repository.findAllByEmailContainingIgnoreCase(email));
	}
	@PostMapping
		
	public ResponseEntity<Usuario> post (@RequestBody Usuario usuario){
			
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(usuario));
	}
		
	@PutMapping
		
	public ResponseEntity<Usuario> put (@RequestBody Usuario usuario){
			
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(usuario));
	}

	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
}
