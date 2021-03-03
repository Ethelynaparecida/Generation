package exercicio18extra;
import java.util.Scanner;

public class Fornecedor extends Pessoa {
	//declarando variaveis
	private float valorCredito;
	private float valorDivida;
	private float saldo;
	
	
	//costrutor de subclasse
	public Fornecedor(String nome, String sobrenome, String endereco, String telefone, float valorCredito, float valorDivida, float saldo) 
	{
		super(nome,  sobrenome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.saldo = saldo;
		
	}
	
	public Fornecedor(String nome, String sobrenome, float valorDivida, float valorCredito) 
	{
		super(nome,  sobrenome);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		
	}
	
	

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}

	public float getSaldo() {
		return saldo = this.valorCredito-this.valorDivida;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
