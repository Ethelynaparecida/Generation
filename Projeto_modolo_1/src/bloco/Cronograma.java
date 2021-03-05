package bloco;

public class Cronograma {
	
	private int PausaExercicio;
	private String Exercicio;
	private String Faixaetaria;
	
	
	public Cronograma(int PausaExercicio, String Exercicio,String Faixaetaria)
	{
		this.PausaExercicio = PausaExercicio;
		this.Exercicio = Exercicio;
		this.Faixaetaria = Faixaetaria;
	}


	public int getPausaExercicio() {
		return PausaExercicio;
	}


	public void setPausaExercicio(int pausaExercicio) {
		PausaExercicio = pausaExercicio;
	}


	public String getExercicio() {
		return Exercicio;
	}


	public void setExercicio(String exercicio) {
		Exercicio = exercicio;
	}


	public String getFaixaetaria() {
		return Faixaetaria;
	}


	public void setFaixaetaria(String faixaetaria) {
		Faixaetaria = faixaetaria;
	}

}