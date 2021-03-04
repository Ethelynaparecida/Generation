package exercicios18;

public class Cavalo  implements Animal {
	private String nome;
	private int idade;
	private String som;
	private boolean status;
	public Cavalo() {
		
		this.nome = "Potro";
		this.idade = 10;
		this.som = "Riiiiiiiii, pocotó, pocotó...";
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
	public void comendoCavalo()
	{
		
		if(status == true) 
		{
			System.out.println("O cavalo esta comendo feno. não mexa com ele.");
		}else {
			System.out.println("O cavalo esta pronto para passear "+this.getSom());
		}
	}
	public boolean isStatus() {
		
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
