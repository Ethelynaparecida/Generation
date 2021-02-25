package Exercicios12;

import java.util.Scanner;

public class class_Exc_12_1 {

	
		public static void main(String args[])
		{
			//1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
			//meses e dias e mostre-a expressa apenas em dias. 
			Scanner leia = new Scanner(System.in);//confg para utilizar o "leia"
			
			int ano, bissexto, mestrinta, dias, mes, idade;
			
			
			System.out.println("Digite quantos anos: ");
			ano = leia.nextInt();//coleta um valor do tipo inteiro
			System.out.println("Digite a quantidade de meses: ");
			mes = leia.nextInt();
			System.out.println("Digite a quantidade de dias: ");
			dias = leia.nextInt();
			
			
			//calculo de meses + meses de 31
			mes = mes * 30 + (mes /2);
			//Descobrindo a quantidade de anos bissextos
			bissexto = ano / 4;
			//calculando o ano
			idade = ano * 365;
			//Somando a quantidade de dias		
			idade = idade + mes + dias + bissexto;
			
			System.out.println("Sua idade em dias é igual a: ");
			System.out.println(idade);
			
			
			
		}
	
}
