package ExcExtraInterface;

public class Conta {
	
	private double sacar, depositar;
	protected double saldo;
	private int conta, agencia;
	private String nome;
	
	
	
	public Conta(double sacar, double saldo, int conta, int agencia, String nome) {
		super();
		
		this.sacar = sacar; 
		this.saldo = saldo;
		this.conta = conta;
		this.agencia = agencia;
		this.nome = nome;
	}

	public void obtersaldo()
	{
		System.out.println();
	}

	public double getSacar() {
		return sacar;
	}

	public void setSacar(double sacar) {
		this.saldo = saldo-sacar;
	}

	

	public double getDepositar() {
		return depositar;
	}

	public void setDepositar(double depositar) {
		this.saldo = saldo + depositar;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [ saldo=" + saldo + ", conta=" + conta
				+ ", agencia=" + agencia + ", nome=" + nome + "]";
	}
	

}
