package VDHeranca;

public class Aluno extends Pessoa{
	private String curso;
	private int matricula;
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void cancelarmatricula()
	{
		System.out.println("A matricula foi cancelada");
	}
	
	public void pagarMensalidade()
	{
		
	}
	
	
	
	

}
