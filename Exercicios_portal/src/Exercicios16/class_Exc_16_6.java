package Exercicios16;

import java.util.Scanner;

public class class_Exc_16_6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/* Escrever um programa que receba vários números inteiros no teclado. 
		 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
		 * (DO...WHILE)*/
		int num = 0, soma = 0, media, cont=1;
		
		
		do
		{
			System.out.println("Digite o valor: ");
			num = leia.nextInt();
			
			if(num%3==0)
			{
				soma = soma+num;
				cont++;
			}
		}while(num!=0);
		
		media = soma/cont;
		System.out.println("Foram digitados "+cont+" valore e a media é "+media+soma);
	}

}
