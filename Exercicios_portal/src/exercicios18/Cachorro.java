package exercicios18;

public class Cachorro implements Animal{
	private String nome;
	private int idade;
	private String som;
	private boolean status;
	public Cachorro() {
		
		this.nome = "Doguinho";
		this.idade = 15;
		this.som = "auuuu, auuuuu...";
		this.setStatus(false);
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
	public void comendoCachorro()
	{
		
		if(status == true) 
		{
			System.out.println("O cachorro esta comendo sua ração. não mexa com ele.");
		}else {
			System.out.println("O cachorro não esta comendo sua ração");
		}
	}
	public boolean isStatus() {
		
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
