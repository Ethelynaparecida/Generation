package exercicios18;

public class Preguica implements Animal{
	private String nome;
	private int idade;
	private String som;
	private boolean status;
	
	public Preguica() {
		
		this.nome = "Preguicinha";
		this.idade = 2;
		this.som = "haaaaaaaaaaaazzzzzzz...";
		this.status = (false);
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
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	@Override
	public void nome() {
		this.nome = nome;
		
	}
	@Override
	public void idade() {
		this.idade = idade;
		
	}
	@Override
	public void emitirSom() {
		
		
		System.out.println(this.som);
		
	}
	public void sobeArvore()
	{
		
		if(status == true) 
		{
			System.out.println("A "+this.getNome()+" esta em cima da arvore"+this.getSom());
		}else {
			System.out.println("A "+this.getNome()+" esta no chão cuidado com ela");
		}
	}
	public boolean isStatus() {
		
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

}