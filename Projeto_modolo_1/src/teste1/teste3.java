package teste1;

import java.util.TimerTask;
import java.util.Timer;

public class teste3 {

	private static TimerTask tarefa;

	public static void main(String[] args) {
		
			
			    Timer timer = new Timer();
			    
			    final long segundos = 1000;
				int teste = 10;
			 
			  
			    TimerTask tarefa = new TimerTask() {
			    	
			    	
			    	@Override
			    	public void run()
			    	{
			    		System.out.println("segundos"+teste);
			    		
			    	}
			    	
			    };
			    timer.schedule(tarefa, 10, segundos);
			  }
	}

}
