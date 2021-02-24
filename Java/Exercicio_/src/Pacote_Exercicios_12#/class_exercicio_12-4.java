package Pacote_Exercicios_10;

import java.util.Scanner;

public class class_exercicio_4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, r, s, d, potencia=0.0;
		
		System.out.println("Digite o valor a: ");
		a = leia.nextDouble();
		System.out.println("Digite o valor b: ");
		b = leia.nextDouble();
		System.out.println("Digite o valor c: ");
		c = leia.nextDouble();
		
		
		r = Math.pow(a+b,2);
		s = Math.pow(b+c, 2.0);
		
		d = (r+s)/2;
		
		System.out.println("valor final "+d);
		
		
	}
}
