package atividadeBloco1;
import java.util.ArrayList;
import java.util.Scanner;
public class TesteArray {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int horaentrada, horaatual, horaTrab=0;
		ArrayList<String> exercicio = new ArrayList<String>();
		
		exercicio.add("Estique o braço direito na horizontal para o lado esquerdo, segure-o com seu braço esquerdo matenha a coluna ereta e respire fundo (10segundos)");
		exercicio.add("\nRepita o movimento invertendo os braços, estique o braço esquerdo e segure com o direito.(10segundos)");
		exercicio.add("\nApoie a mão direita na cintura e mantenha os joelhos flexionados, com o braço esquerdo incline-se para a lateral  estique o  braço sobre a cabeça. (10segundos)");
		exercicio.add("\nRepita o movimento invertendo os braços, estique o braço direito sobre a cabeça e apoie a mão esquerda na cintura(10segundos)");
		exercicio.add("\nPuxe os dois braços para cima, juntando as mãos. Sinta todo o tronco alongar e fique apoiado na ponta dos pes.(15segundos)");
		exercicio.add("\nAgora, junte os dois braços para trás do corpo. Você irá sentir o seu peito alongando. respire fundo.(15segundos)");
		exercicio.add("\nUsando uma parede ou movel como apoio eleve seu pe direito e segura ele atras.(10segundos), repita o movimento invertento os pes.(10segundos)");
		exercicio.add("\nFaça movimentos circulares no sentido horario com o pescoço 4 vezes, repita no sentido anti-horario.");
		/*for (String x: exercicio) {
			System.out.println(x);
			for(t=10;t>0;t--) {
			System.out.println(t);
			}
		}*/
		
		//Pessoa pe1 = new Pessoa(2, "Alongamento", "Jovem", "Maria", 25,"bom",8);
		
		Pessoa pe1 = new Pessoa(horaTrab, null, null, null, horaTrab, null);
		pe1.getInfoPessoa();
		System.out.println("\nInforme a hora de entrada: ");
		horaentrada = ler.nextInt();
		horaatual = horaentrada;
		
		/*while(horaTrab<=8) {
			if(horaatual-horaentrada==2) {
				System.out.println("\nHora atual: "+horaatual+"\n\t\tNotificação MoveIT hora de fazer Exercícios.....\n");
				System.out.println(exercicio);
			}
			else if(horaatual-horaentrada==4) {
				System.out.println("\nHora atual: "+horaatual+"\n\t\tNotificação MoveIT hora de fazer Exercícios.....\n");
				System.out.println(exercicio);
			}
			else if(horaatual-horaentrada==6) {
				System.out.println("\nHora atual: "+horaatual+"\n\t\tNotificação MoveIT hora de fazer Exercícios.....\n");
				System.out.println(exercicio);
			}else if(horaatual-horaentrada==8){
				System.out.println("\nHora atual: "+horaatual+"\n\t\tNotificação MoveIT hora de fazer Exercícios.....\n");
				System.out.println(exercicio);
			}else {
				System.out.println("\nHora atual: "+horaatual+" Sem exercício\n");	
			}
			horaatual++;
			horaTrab++;
	}*/
		
		//String[] atividades = {"atividade1","Atividade2","atividade3"};
		int segundos = 15;
				 
		 for(int x =0; x<exercicio.size();x++) {
					 
		 try{ 
			 for (int i = segundos; i > 0; i--)
			 { 
				 for (int c=0; c<50; c++)
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
		 
		 /*cronometo para o tempo de pausa no
		  * trabalho */
		 segundos = 59; 
		 int minutos=0;
		 int horas=1;
		  
		 try{ 
			 for (int i = segundos; horas > 0; i--)
			 { 
			 	System.out.println(horas + " : "+minutos+" : " +i );
			 		 if(i==0)
			 		 {
			 			 minutos--;
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
		 
	}


}

