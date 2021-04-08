package com.testeunitario.testeunitario.contato;



import java.rmi.UnexpectedException;

import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

import com.testeunitario.testeunitario.modelo.ContatoModel;
import com.testeunitario.testeunitario.repository.ContatoRepository;





@RunWith(SpringRunner.class) 
@DataJdbcTest 

public class ContatosRepositoryIntegrationTest {

	private ContatoModel contato; 
	@Autowired 
	private ContatoRepository contatoRepository; 
	@Before 
	public void start() { 
	contato = new ContatoModel("Gabriel", "011y", "9xxxxxxx9"); } 
	
	@rule 
	public UnexpectedException esperadaExcecao = UnexpectedException.none(); 
	@org.junit.jupiter.api.Test 
	public void salvarComTelNulo() throws Exception { 
	esperadaExcecao.expect(ConstraintViolationException.class); esperadaExcecao.expectMessage("O Telefone deve ser preenchido"); 
	contato.setTelefone(null); 
	contatoRepository.save(contato); 
	} 
	@org.junit.jupiter.api.Test 
	public void salvarComDddNulo() throws Exception { 
	esperadaExcecao.expect(ConstraintViolationException.class); esperadaExcecao.expectMessage("O DDD deve ser preenchido"); 
	contato.setDdd(null); 
	contatoRepository.save(contato);

	
}
}
