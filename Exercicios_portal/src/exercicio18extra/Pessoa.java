package exercicio18extra;
import java.util.Scanner;

public class Pessoa {
	private String nome; 
	private String sobrenome;
	private String endereco;
	private String telefone;
	
	
	public Pessoa(String nome, String sobrenome, String telefone, String endereco) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public void setdadosPessoa(String nome, String sobrenome)
	{
		this.nome=nome;
		this.sobrenome=sobrenome;
	}
	
	
	public void setdadosContatoPessoa(String endereco, String telefone)
	{
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
