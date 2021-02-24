package Pacote_Exercicios_10;

import java.util.Scanner;

public class class_exercicio_7 {
 public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	double a, b, c, d, eh, f, x, y;
	
	System.out.println("ola digite a");
	a = leia.nextInt();
	System.out.println("ola digite b");
	b = leia.nextInt();
	System.out.println("ola digite c");
	c = leia.nextInt();
	System.out.println("ola digite d");
	d = leia.nextInt();
	System.out.println("ola digite eh");
	eh = leia.nextInt();
	System.out.println("ola digite f");
	f = leia.nextInt();
	
	System.out.println();
	
	x = ((c*eh)-(b*f))/ ((a*eh)-(b*d));
	y = ((a*f)-(c*d))/ ((a*eh)-(b*d));

	System.out.println("X igual: "+ Math.round(x)+ " Y igual: "+ Math.round(y));
	
	
}
}
