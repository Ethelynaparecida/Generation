package br.com.shopGame.shopGame.controller;

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

import br.com.shopGame.shopGame.model.Compras;

import br.com.shopGame.shopGame.repository.ComprasRepository;

@RequestMapping("/compra")
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ComprasController {

	@Autowired
	private ComprasRepository repository;

	@GetMapping
	public ResponseEntity<List<Compras>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Compras> getById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<Compras> post(@RequestBody Compras id) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(id));
	}

	@PutMapping
	public ResponseEntity<Compras> put(@RequestBody Compras id) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(id));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
