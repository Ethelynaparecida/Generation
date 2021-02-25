package Exercicios12;

import java.util.Scanner;

public class class__Exc_12_2 {
	public static void main (String args[])
	{
		int dias, mes, ano;
		double mestrinta, idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de dias: ");
		dias = leia.nextInt();
		
		
		//Calculando a quantidade de anos
		ano = dias / 365;
				
		//Coletando o resto de dias
		mes = dias % 365;
		//Calculando a uqantidade de meses
		mestrinta = mes /30;

		//Calculando o resto de dias
		idade = mes % 30;
		
		System.out.print("anos " + ano + ", meses "+ mestrinta + ", dias " + idade );
		
		
	}
}
