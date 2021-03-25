package br.com.shopGame.shopGame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.shopGame.shopGame.model.Compras;

@Repository
public interface ComprasRepository extends JpaRepository<Compras, Long> {

	public List<Compras> findAllById(Long id);
}
