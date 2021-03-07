package VARelacClasses;

import java.util.Scanner;

public class UltraEmojiCombat {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador ("Pretty.Boy", "França", 31, 68.9f, 1.75f, 11, 2, 1);
		
		l[1] = new Lutador ("Putscript", "Brasil", 29, 58.8f, 1.68f, 14, 2, 3);
		
		l[2] = new Lutador ("Snapshadow", "EUA", 35, 80.9f, 1.65f, 12, 2, 1);
		
		l[3] = new Lutador ("Dead Code", "Austrlia", 28, 81.6f, 1.93f, 13, 0, 2);
		
		l[4] = new Lutador ("UfoCobol", "Brasil", 37, 119.3f, 1.70f, 5, 4, 3);
		
		l[5] = new Lutador ("Nerdaart", "EUA", 30, 105.7f, 1.81f, 12, 2, 4);
		
		Luta lt1 = new Luta();
		lt1.marcarLuta(l[0],l[1]);
		
		lt1.lutar();
	}

}
