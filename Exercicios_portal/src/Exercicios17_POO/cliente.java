package Exercicios17_POO;

public class cliente {
	
	//criando os atributos do objeto
	private String primeiroNome;
	private String ultimoNome;
	private String numeroCpf;
	
	//construtor.Executa um procedimento
	/*public cliente(String nome, String ultimo, String cpf)
	{
		primeiroNome = nome;
		ultimoNome = ultimo;
		numeroCpf = cpf;
	}*/

	public String getPrimeiroNome() {
		
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		
		this.primeiroNome = primeiroNome;
		
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	
	
	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getDadosCliente()
	{
		String dadosCompletos = primeiroNome + "  " + ultimoNome + "  "+numeroCpf;
		return dadosCompletos;
	}
}
