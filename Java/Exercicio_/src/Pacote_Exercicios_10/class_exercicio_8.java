package Pacote_Exercicios_10;

import java.util.Scanner;

public class class_exercicio_8 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
				
		double custofabrica, custodistribuidor, custoimposto;
		
		System.out.println("Ola digite o valor de fabrica ");
		custofabrica = leia.nextDouble();
		
		//Calculando a porcentagem do distribuidor em cima do valor de fabrica
		custodistribuidor =  28*(custofabrica/100);
		//Calculando a porcentagem do imposto em cima do valor de fabrica
		custoimposto =  45*(custofabrica/100);
				
		//Somando os valores
		custofabrica = custodistribuidor + custoimposto + custofabrica;
		
		System.out.println("O valor final eh de "+custofabrica);
	}
}
