package Exercicios12;

import java.util.Scanner;

public class class_Exc_12_6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double raiz, potum, potdois, yum, ydois, xum, xdois;
		
		System.out.print("escreva x1 ");
		xum = leia.nextDouble();
		System.out.print("escreva yum ");
		yum = leia.nextDouble();
		System.out.print("escreva xdois ");
		xdois = leia.nextDouble();
		System.out.print("escreva ydois ");
		ydois = leia.nextDouble();
		
		//calculo do ponto em x
		potum =Math.pow(xdois - xum, 2.0);
		//calculo do ponto em y
		potdois = Math.pow(yum - ydois, 2.0);

		//calculo da raiz quadrada
		raiz = Math.sqrt(potum + potdois);
		
		
		System.out.println("O resultado é "+ Math.round(raiz));

	}

}
