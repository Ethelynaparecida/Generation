package teste1;

public class contador {

	 public static void main(String[] args){ 
		 
		 int segundos = 3; 
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
		 
			 
			 
			 /*  for 
			 (int i = segundos; i > 0; i--)
		 { 
			 System.out.println(i + " segundos"); 
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1 segundo 
			 } System.out.println("Proximo exercicio"); */
		 
		 
	 
	

