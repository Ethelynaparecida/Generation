package teste1;

public class Principal {

	public static void main(String[] args) {

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
		
		

	}

}
