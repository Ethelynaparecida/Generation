package br.com.ecommerce.ecommerce.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.ecommerce.ecommerce.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);


	public List<Produto> findAllByValorLessThanEqual(Float valor);

	public List<Produto> findAllByValorGreaterThanEqual(Float valor);
	
	
	/*@Query(value = "SELECT nome, valor FROM tb_produto", nativeQuery = true )
	public Optional<Produto> findAllByValor();*/
	@Query(value = "select * FROM tb_produto where nome=:nome ", nativeQuery = true )
	public List<Produto> findByNomeContainingIgnoreCase (@Param("nome") String nome);
	
	@Query(value= "select * From tb_produto where valor<10", nativeQuery = true)
	public List<Produto> valorMenor();
	
	@Query(value= "select * From tb_produto where valor between 11 and 52", nativeQuery = true)
	public List<Produto> valorEntre();
	
	@Query(value= "select * From tb_produto where valor>52", nativeQuery = true)
	public List<Produto> valorMaior();
}
