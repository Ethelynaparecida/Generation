package atividadeBloco1;

import java.util.Scanner;

public class PessoaH extends CronogramaH {
	
	Scanner ler = new Scanner(System.in);
	private String Nome;
	private int Idade;
	private String EstadoDeSaude;
	//private float HorasTrabalhadas;
	
	public PessoaH(int PausaExercicio, String Exercicio,String Faixaetaria,String Nome,int Idade,String EstadoDeSaude)//float HorasTrabalhadas)
	{
		super(PausaExercicio,Exercicio,Faixaetaria);
		
		this.Nome = Nome;
		this.Idade = Idade;
		this.EstadoDeSaude = EstadoDeSaude;
		//this.HorasTrabalhadas = HorasTrabalhadas;
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

	/*public float getHorasTrabalhadas() {
		return HorasTrabalhadas;
	}

	public void setHorasTrabalhadas(float horasTrabalhadas) {
		HorasTrabalhadas = horasTrabalhadas;
	}*/
	
	public void getInfoPessoa() {
		System.out.println("Informe o seu nome: ");
		Nome = ler.nextLine();
		System.out.println("Informe sua idade: ");
		Idade = ler.nextInt();
		ler.nextLine();
		System.out.println("Informe seu estado de saúde: ");
		EstadoDeSaude = ler.nextLine();
		System.out.println(Nome+" idade: "+Idade+" anos estado de saúde: "+EstadoDeSaude);
		System.out.println("\n\n\t\tBem vindo ao MoveIT\n");
	}
}