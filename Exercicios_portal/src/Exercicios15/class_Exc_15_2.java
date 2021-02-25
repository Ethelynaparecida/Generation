package Exercicios15;

import java.util.Scanner;

public class class_Exc_15_2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	/* Faça um programa que entre com três números e coloque em ordem crescente.*/
		
		int num, ndois, ntres;
		System.out.println("digite o valor um: ");
		num = leia.nextInt();
		System.out.println("digite o valor dois: ");
		ndois = leia.nextInt();
		System.out.println("digite o valor tres: ");
		ntres = leia.nextInt();
		
		if(ntres>num && ntres>ndois && ndois> num)
		{
			System.out.println("A sequencia é: " + ntres+ndois+num);
			
		}else if(ntres>num && ntres>ndois && num > ndois) {
			
			System.out.println("A sequencia é: " + ntres+num+ndois);
			
		}else if(ndois>num && ndois>ntres && ntres> num) {
			System.out.println("o maior valor é: " + ndois + ntres + num);
			
		}else if(ndois>num && ndois>ntres && num> ntres) {
			System.out.println("o maior valor é: " + ndois + num + ntres);
		}else if(num>ntres && num>ndois && ndois> ntres) {
			System.out.println("o maior valor é: " + num + ndois + ntres);
		}else {
			System.out.println("o maior valor é: " + num + ntres + ndois);
		}
		
	}

}
