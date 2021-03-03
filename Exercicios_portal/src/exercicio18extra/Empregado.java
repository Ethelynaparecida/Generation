package exercicio18extra;

public class Empregado extends Pessoa{
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;

	public Empregado(String nome, String sobrenome, String endereco, String telefone, float salarioBase, float imposto, int codigoSetor)
	{
		super(nome, sobrenome, endereco, telefone);
		this.salarioBase=salarioBase;
		this.imposto=imposto;
		this.codigoSetor=codigoSetor;
	}
	public Empregado(String nome, String sobrenome, float salarioBase, int codigoSetor)
	{
		super(nome, sobrenome);
		this.salarioBase=salarioBase;
		this.codigoSetor=codigoSetor;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		
		return imposto;
	}

	public void setImposto(float imposto) {
		
		this.imposto = imposto;
	}
	
	
	public float calculoSalario(){
		return this.salarioBase + (this.salarioBase/this.imposto);
	}
	//;;
	
}
	
	
	
