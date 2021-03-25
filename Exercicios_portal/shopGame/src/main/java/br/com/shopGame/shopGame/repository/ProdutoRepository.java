package br.com.shopGame.shopGame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.shopGame.shopGame.model.Produto;
@Repository 
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);

	public List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}
