package Exercicios15;

import java.util.Scanner;

public class class_Exc_15_2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	/* Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/
		
		int num, ndois, ntres;
		System.out.println("digite o valor um: ");
		num = leia.nextInt();
		System.out.println("digite o valor dois: ");
		ndois = leia.nextInt();
		System.out.println("digite o valor tres: ");
		ntres = leia.nextInt();
		
		if(ntres>num && ntres>ndois && ndois> num)
		{
			System.out.println("A sequencia �: " + ntres+ndois+num);
			
		}else if(ntres>num && ntres>ndois && num > ndois) {
			
			System.out.println("A sequencia �: " + ntres+num+ndois);
			
		}else if(ndois>num && ndois>ntres && ntres> num) {
			System.out.println("o maior valor �: " + ndois + ntres + num);
			
		}else if(ndois>num && ndois>ntres && num> ntres) {
			System.out.println("o maior valor �: " + ndois + num + ntres);
		}else if(num>ntres && num>ndois && ndois> ntres) {
			System.out.println("o maior valor �: " + num + ndois + ntres);
		}else {
			System.out.println("o maior valor �: " + num + ntres + ndois);
		}
		
	}

}
