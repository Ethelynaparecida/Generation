package VARelacClasses;

public class Lutador {
	private String nome, nacionalidade, categoria;
	private float altura;
	private float peso;
	private int idade, vitorias, derrotas, empates;
	
	public Lutador(String nome, String nacionalidade, int idade, float peso, float altura, int vitorias, int derrotas, int empates) {
		this.nome= nome;
		this.nacionalidade=nacionalidade;
		this.altura = altura;
		this.idade=idade;
		//eu utilizo o setPeso pra assim que eu usar o consttrutor ele vai char tudo oq estiver no modulo
		this.setPeso(peso);
		this.vitorias=vitorias;
		this.derrotas=derrotas;
		this.empates=empates;
	}

	
	
	public void apresentar()
	{
		System.out.println("Lutador: "+getNome());
		System.out.println("Origem: "+getNacionalidade());
		System.out.println("idade:  "+getIdade());
		System.out.println("Altura: "+getAltura());
		System.out.println("Peso:  "+getPeso());
		System.out.println("Ganhou: "+getVitorias()+" lutas");
		System.out.println("Perdeu: "+getDerrotas()+" lutas");
		System.out.println("Empatou: "+getEmpates()+" lutas");
	}
	public void status()
	{
		System.out.print("Lutador: "+getNome());
		System.out.println(" da categoria "+getCategoria());
		System.out.println("Ganhou: "+getVitorias()+" lutas");
		System.out.println("Perdeu: "+getDerrotas()+" lutas");
		System.out.println("Empatou: "+getEmpates()+" lutas");
	}
	public void ganharLutar()
	{
		//this.setVitorias(this.getVitorias()+1);
		this.vitorias = this.vitorias+1;
	}
	public void perderLuta() {
		this.vitorias = this.vitorias+1;
		//this.setDerrotas(this.getDerrotas()+1);
	}
	public void empartarLutas()
	{
		this.empates=this.empates+1;
		//this.setEmpates(this.getEmpates()+1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		this.categoria = categoria;
		
		if(this.peso<52.2)
		{
			this.categoria = "Invalido";
		} else if(this.peso<=70.3)
				{
				this.categoria = "Leve";
				} else if(this.peso<=83.9)
						{
						this.categoria = "Médio";
						}else if(this.peso<=120.2) 
						{
							this.categoria = "Pesado";
						}else {
							this.categoria = "Invalido";
							}
	}
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float f) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}



	
	

	
	
	

}
