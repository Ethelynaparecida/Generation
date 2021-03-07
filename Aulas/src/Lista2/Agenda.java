package Lista2;

import java.util.Scanner;

public class Agenda {
	Scanner leia = new Scanner(System.in);
	
	private String nome;
	private int idade;
	private double altura;
	
	
	
	public Agenda(String nome, int idade, double altura) {
	
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void armazenaPessoa()
	{
		System.out.println("digitar as informaçoes: ");
		this.setAltura(leia.nextDouble());
		this.setIdade(leia.nextInt());
		this.setNome(leia.next());
	}
	public void removePessoa()
	{
		this.setNome(null);
		this.setIdade(0);
		this.setAltura(0.0);
	}
	public void imprimeAgenda()
	{
		
	}
	public void imprimePessoa()
	{
		
	}
	@Override
	public String toString() {
		return "Agenda [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}
	
}
