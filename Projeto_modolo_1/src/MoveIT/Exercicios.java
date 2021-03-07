package MoveIT;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicios {
	Scanner leia = new Scanner(System.in);
	
	//coleta as informações da classe pessoa
	private Pessoa usuario;
	
	
	
	
	public Exercicios(Pessoa usuario) {
		super();
		this.usuario = usuario;
	}



	public void cadaUs()
	{
		this.usuario.getIdade();
		this.usuario.getNome();
			
	}
	
	
	
	public Pessoa getUsuario() {
		return usuario;
	}



	public void setUsuario(Pessoa usuario) {
		this.usuario = usuario;
	}



	@Override
	public String toString() {
		return "Exercicios [usuario=" + usuario + "]";
	}


	//Alongamentos para jovens
	public void jovem ()
	{
		//Apresentando a categoria de exercicio
		int segundos = 2;
		 
							 
		 try{ 
			 for (int i = segundos; i > 0; i--)
			 { 
				 for (int c=0; c<15; c++)
				 {
				     System.out.println();
				 }
				 
			 	System.out.println("Categoria jovem, aguarde um instante...");
			 					 			 
			 Thread.sleep(1000); // 1 segundo 
			 } 
		 System.out.println("Vamos la"); 
			 } 
		 catch (InterruptedException e)
		 	{ 
			 System.out.println("");
			} 
				 
		//exercicios para a categoria jovem
		ArrayList<String> exer = new ArrayList<String>();
		
		exer.add("Estique o braço direito na horizontal para o lado esquerdo,\n segure-o com seu braço esquerdo matenha a coluna ereta e respire fundo");
		exer.add("\nRepita o movimento invertendo os braços, estique o braço esquerdo e segure com o direito.");
		exer.add("\nApoie a mão direita na cintura e mantenha os joelhos flexionados,\n com o braço esquerdo incline-se para a lateral  estique o  braço sobre a cabeça. ");
		exer.add("\nRepita o movimento invertendo os braços, estique o braço direito sobre a cabeça e\n apoie a mão esquerda na cintura");
		exer.add("\nPuxe os dois braços para cima, juntando as mãos. Sinta todo o tronco alongar e\n fique apoiado na ponta dos pes.");
		exer.add("\nAgora, junte os dois braços para trás do corpo. Você irá sentir o seu peito alongando. respire fundo.");
		exer.add("\nUsando uma parede ou movel como apoio eleve seu pe direito e segura ele atras.\nRepita o movimento invertento os pes.");
		exer.add("\nFaça movimentos circulares no sentido horario com o pescoço 4 vezes, repita no sentido anti-horario.");
		
		//apresentação dos exercicios a cada 10 segundos
		 segundos = 10;
		 
		 for(int x =0; x<exer.size();x++) {
					 
		 try{ 
			 for (int i = segundos; i > 0; i--)
			 { 
				 for (int c=0; c<15; c++)
				 {
				     System.out.println();
				 }
				 System.out.println(exer.get(x));
			 	System.out.println("\n"+ i +" Segundos");
			 					 			 
			 Thread.sleep(1000); // 1 segundo 
			 } 
		 System.out.println("Terminado"); 
			 } 
		 catch (InterruptedException e)
		 	{ 
			 System.out.println("");
			} 
		 }
	}
	
	//Alongamentos para idosos
	public void idoso()
	{
		
		//apresentando a categoria
		int segundos = 3;
		 
		 
		 try{ 
			 for (int i = segundos; i > 0; i--)
			 { 
				 for (int c=0; c<15; c++)
				 {
				     System.out.println();
				 }
				 
			 	System.out.println("Categoria idoso, aguarde um instante...");
			 					 			 
			 Thread.sleep(1000); // 1 segundo 
			 } 
		 System.out.println("Vamos la"); 
			 } 
		 catch (InterruptedException e)
		 	{ 
			 System.out.println("");
			} 
		ArrayList<String> exercicio = new ArrayList<String>();
		
		
		//lista de exercicios 
		exercicio.add("Estique o braço direito na horizontal para o lado esquerdo, segure-o com seu braço \nesquerdo matenha a coluna ereta e respire fundo ");
		exercicio.add("\nRepita o movimento invertendo os braços, estique o braço esquerdo e segure com o direito.");
		exercicio.add("\nAgora, junte os dois braços para trás do corpo. Você irá sentir o seu peito alongando. respire fundo.");
		exercicio.add("\nUsando uma cadeira ou movel como apoio eleve seu pé direito repita o movimento invertento os pes.");
		exercicio.add("\nRepita o movimento invertento os pes, levante o pé esquerdo");
		exercicio.add("\nFaça movimentos circulares no sentido horario com o pescoço 4 vezes, repita no sentido anti-horario.");
		
		//apresentaçãod e cada exercicios a cada 10 segundos
		 segundos = 10;
		 
		 for(int x =0; x<exercicio.size();x++) {
					 
		 try{ 
			 for (int i = segundos; i > 0; i--)
			 { 
				 for (int c=0; c<15; c++)
				 {
				     System.out.println();
				 }
				 System.out.println(exercicio.get(x));
			 	System.out.println("\n"+ i +" Segundos");
			 					 			 
			 Thread.sleep(1000); // 1 segundo 
			 } 
		 System.out.println("Terminado"); 
			 } 
		 catch (InterruptedException e)
		 	{ 
			 System.out.println("");
			} 
		 }
		
		
	
	}
	
	
}
