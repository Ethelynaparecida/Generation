package Exercicios16;

import java.util.Scanner;

public class class_Exc_16_5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		/* Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
		No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
		
		int num = 0, soma=0;
		
		do
		{
			System.out.println("Digite um valor ");
			num = leia.nextInt();
			soma = soma+num;
		}while(num!=0);

	}

}
