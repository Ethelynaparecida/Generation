package teste1;

public class exeecução {

	public static void main(String[] args) {
		
		/* Executa a exibição dos exercicios e cronometro
		 *quando o cronometro termina ele passa a exibir
		 *o proximo alongamento de acordo com a Array.
		 * */
		String[] atividades = {"atividade1","Atividade2","atividade3"};
		int segundos = 15;
				 
		 for(int x =0; x<atividades.length;x++) {
					 
		 try{ 
			 for (int i = segundos; i > 0; i--)
			 { 
				 for (int c=0; c<50; c++)
				 {
				     System.out.println();
				 }
				 System.out.println(atividades[x]);
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
		 segundos = 3; 
		 int minutos=1;
		 int horas=2;
		  
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
