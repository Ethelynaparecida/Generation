package Exercicios16;

import java.util.Scanner;

public class class_Exc_16_3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade=0, cont21=0, cont50=0;
		
		/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de 
		pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
		
		
		while(idade!=-99)
		{
			System.out.println("Digite uma idade ");
			idade = leia.nextInt();
			
			if(idade <21)
			{
				cont21++;
			}
			if(idade >50)
			{
				cont50++;
			}
		}

	}

}
