package br.com.shopGame.shopGame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.shopGame.shopGame.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public List<Usuario> findAllByNomeContainingIgnoreCase (String nome);
	
}
