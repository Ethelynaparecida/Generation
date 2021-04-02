package br.com.ecommerce.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.ecommerce.model.Produto;
import br.com.ecommerce.ecommerce.model.Usuario;
import br.com.ecommerce.ecommerce.repository.ProdutoRepository;
import br.com.ecommerce.ecommerce.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	private @Autowired UsuarioRepository repositoryUsuario;
	private @Autowired ProdutoRepository repositoryProduto;

	public Usuario cadastroUsuario(Usuario novoUsuario) {
		Optional<Usuario> usuarioExistente = repositoryUsuario.findById(novoUsuario.getId());
		
		if(usuarioExistente.isPresent()) {
			return null;
		}
		
		return repositoryUsuario.save(novoUsuario);
	}
	
	//Cadastrando novo produto criado pelo usuario
	public Produto cadastrarProduto(Produto novoProduto, Long idUsuario) {
		Produto produtoExistente = repositoryProduto.save(novoProduto);
		Optional<Usuario> usuarioExistente = repositoryUsuario.findById(idUsuario);
		
		if(usuarioExistente.isPresent()) {
			produtoExistente.setUsuario(usuarioExistente.get());
			return repositoryProduto.save(produtoExistente);
		}
		return null;
	}
	
	
}
