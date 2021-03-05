package TrabalhoBlocoI;
 
public class Pessoa extends Cronograma {
	private String Nome;
	private int Idade;
	private String EstadoDeSaude;
	private float HorasTrabalhadas;
	
	public Pessoa(int PausaExercicio, String Exercicio,String Faixaetaria,String Nome,int Idade,String EstadoDeSaude,float HorasTrabalhadas)
	{
		super(PausaExercicio,Exercicio,Faixaetaria);
		
		this.Nome = Nome;
		this.Idade = Idade;
		this.EstadoDeSaude = EstadoDeSaude;
		this.HorasTrabalhadas = HorasTrabalhadas;
		
		
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getEstadoDeSaude() {
		return EstadoDeSaude;
	}

	public void setEstadoDeSaude(String estadoDeSaude) {
		EstadoDeSaude = estadoDeSaude;
	}

	public float getHorasTrabalhadas() {
		return HorasTrabalhadas;
	}

	public void setHorasTrabalhadas(float horasTrabalhadas) {
		HorasTrabalhadas = horasTrabalhadas;
	}
	

}
