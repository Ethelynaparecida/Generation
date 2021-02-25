package Exercicios15;

import java.util.Scanner;

public class class_Exc_15_1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		/* Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		
		int num, ndois, ntres;
		
		System.out.println("digite o valor um: ");
		num = leia.nextInt();
		System.out.println("digite o valor dois: ");
		ndois = leia.nextInt();
		System.out.println("digite o valor tres: ");
		ntres = leia.nextInt();
		
		if(ntres>num && ntres>ndois)
		{
			System.out.println("o maior valor é: " + ntres);
		}else if(ndois>num && ndois>ntres) {
			System.out.println("o maior valor é: " + ndois);
		}else {
			System.out.println("o maior valor é: " + num);
		}
		
	}
}
