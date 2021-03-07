package MoveIT;

import java.util.Scanner;

public class Pessoa implements Execucao{
	Scanner leia = new Scanner(System.in);
	
	private String nome, sobrenome, sexo;
	private int idade;
	

	
	public Pessoa(String nome, String sobrenome, String sexo, int idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	
		this.sexo = sexo;
		this.idade = idade;
		
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	//Leitura dos dados do usuario
	@Override
	public void cadastroUsuario() {
		
		System.out.println("******* Ola, Bem vindo ao moveIT ********");
		System.out.println("Para começar informe o seu nome: ");
		this.setNome(leia.next());	
		System.out.println("informe o seu sobrenome: ");
		this.setSobrenome(leia.next());
		System.out.println("Informe sua idade: ");
		this.setIdade(leia.nextInt());
		System.out.println("Informe seu sexo Masculino ou Feminino: ");
		this.setSexo(leia.next());
		
		
		
	
		
	}
	
	//cronometro do tempo de pausa
	//esta com a contagem menor para a apresentação
	@Override
	public void conta2() {
		int op, cont=0;
		int segundos = 59; 
		 int minutos=0;
		 int horas=1;
		  
		 try{ 
			 for (int i = segundos; horas>0; i--)
			 //correto for (int i = segundos; cont <=120; i--)
			 { 
			 	System.out.println(horas + " : "+minutos+" : " +i );
			 	cont++;
			 		 if(i==0)
			 		 {
			 			 minutos -=20;
			 			 i=60;
			 		 }
			 		if(minutos==0)
			 		{
			 			 horas--;
			 			 minutos=60;
			 		}
			 			 
			 Thread.sleep(1000); // 1 segundo 
			 } 
		 System.out.println("Pausa para o cafe"); 
			 } 
		 catch (InterruptedException e)
		 	{ 
			 System.out.println("Interromperam meu sono!");
			} 
		 	
		 //fim do conometro texte para saber se o usuario ira voltar a trabalhar
		 	System.out.println("Depois de 15 minutos....");
		 
		 System.out.println("\n\nPausa terminada escolha uma opção\n1-> voltar ao trabalho\n2->Procastinar");
		 op = leia.nextInt();	 
		if (op==1)
		{
			this.conta2();
		}else {
			System.out.println("Voce deve voltar a trabalhar ou seu chefe ira sentir sua falta");
		}
		
		
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", sexo=" + sexo + ", idade=" + idade + "]";
	}


	
	

}


