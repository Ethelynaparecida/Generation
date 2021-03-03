package teste1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Henrique Ferreira da Silva
 */
public class teste {

    private static int segundos;
	private Timer cronometro;
    private DateFormat formato = new SimpleDateFormat("HH:mm:ss");
    private Calendar calendario = Calendar.getInstance();
    private byte contagem = 0;
    public static final byte PROGRESSIVA = 1;
    public static final byte REGRESSIVA = -1;

    public teste( int horas, int minutos, int segundos, byte tipoContagem) {
        this.cronometro = new Timer();
        calendario.set( horas, minutos, segundos);
        this.contagem = tipoContagem;
    }

    public void cronometro() {
        TimerTask tarefa = new TimerTask() {

            @Override
            public void run() {
                System.out.println(getTime());
            }
        };
        cronometro.scheduleAtFixedRate(tarefa, 0, 1000);
        this.cronometro = null;
    }

    public String getTime() {
        calendario.add(Calendar.SECOND, contagem);
        return formato.format(calendario.getTime());
    }

    public static void main(String[] args) {
    	
        teste contagem = new teste( 2, 0, 10, REGRESSIVA);
       
        contagem.cronometro();
    	
    	System.out.print("acabou");
    }
}
