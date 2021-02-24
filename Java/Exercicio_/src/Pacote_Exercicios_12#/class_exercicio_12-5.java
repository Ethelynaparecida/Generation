package Pacote_Exercicios_10;

import java.util.Scanner;

public class class_exercicio_5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		 //Declaração de variaveis
		double a, b, c, media;

		//Coleta de dados
		System.out.println("ola digite nota 1: ");
		a = leia.nextDouble();
		System.out.println("ola digite nota 2: ");
		b = leia.nextDouble();
		System.out.println("ola digite nota 3: ");
		c = leia.nextDouble();

		//calculo dos pesos de cada nota
		a=a*2;
		b=b*3;
		c=c*5;

		//callculo da media proporcional
		media = (a+b+c)/10;

		System.out.println("Media é igual: "+ Math.round(media));
	}
}
