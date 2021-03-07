package VDHeranca;

public class Professor {

	private String especialidade;
	private float salario;

	
	

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void receberAum(int novoSalario)
	{
		this.salario+=novoSalario;
		System.out.println("novo salario igual a "+this.salario);
	}
	
	
}
