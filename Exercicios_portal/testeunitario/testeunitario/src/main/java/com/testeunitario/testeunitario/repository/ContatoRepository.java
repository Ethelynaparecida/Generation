package com.testeunitario.testeunitario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testeunitario.testeunitario.modelo.ContatoModel;



@Repository
public interface ContatoRepository extends JpaRepository< ContatoModel, Long>{

	
	
}
