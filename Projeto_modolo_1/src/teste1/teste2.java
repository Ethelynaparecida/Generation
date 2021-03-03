package teste1;

import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.Timer;

public class teste2 {
	public static void main(String[] args) {
		

	
	
		/**
		* Objetivo: Controlar o timer 
		* Data: 07/08/2006
		* @author Fabio Pedrosa
		* @version 1.0
		*/
		

			/** Constantes */
			private static final int TIME = 1000;
			/** Atributos */
			private static DateFormat dateFormat = null;
			private static Calendar calendar = null;
			private static Timer timer = null;

			static {
				dateFormat = new SimpleDateFormat("HH:mm:ss");
				calendar = Calendar.getInstance();
				calendar.set(Calendar.MILLISECOND, 0);
		        calendar.set(Calendar.SECOND, 0);
		        calendar.set(Calendar.MINUTE, 0);
		        calendar.set(Calendar.HOUR_OF_DAY, 0);
			}
			
			/** Construtor */
			private TimerCall() {}

			/**
			* Objetivo: Iniciar o timer da ligação 
			* Data: 07/08/2006
			* @param action ActionListener
			*/
			public static void startTimer(ActionListener action) {
				timer = new Timer(TIME, action);
				timer.start();
			}
			
			/**
			* Objetivo: Parar o timer da ligação 
			* Data: 07/08/2006
			*/
			public static void stopTimer() {
				System.out.println("stopTime()");
				if(timer!=null){
					if(timer.isRunning()) {
						timer.stop();
						resetTimer();
					}
				}	
			}
			
			public static boolean isTimerRunning(){
				boolean flagTimer = false;
				if(timer!=null){
					if(timer.isRunning()){
						flagTimer = true;
					}
				}	
				return flagTimer;
			}
			
			/**
			* Objetivo: Zerar o timer da ligação 
			* Data: 07/08/2006
			*/
			protected static void resetTimer() {
				calendar.set(Calendar.MILLISECOND, 0);
		        calendar.set(Calendar.SECOND, 0);
		        calendar.set(Calendar.MINUTE, 0);
		        calendar.set(Calendar.HOUR_OF_DAY, 0);
		        timer = null;
			}

		   /**
		   * Objetivo: Montar o timer 
		   * Data: 07/08/2006
		   * @return String
		   */
			public static String getTime() {
				calendar.add(Calendar.SECOND, 1);
				if(timer != null) {
				    return dateFormat.format(calendar.getTime());
				}
				return "";
		    }
		
		}
	}

