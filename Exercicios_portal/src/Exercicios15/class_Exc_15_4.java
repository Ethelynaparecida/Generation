package Exercicios15;

import java.util.Scanner;

public class class_Exc_15_4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float n, resto;
		
		System.out.println("digite um valor: ");
		n = leia.nextFloat();
		
		resto = n%2;
		
		if(resto == 0)
		{
			System.out.println("O valor "+ n +" é par e sua raiz é " + Math.sqrt(n));
		}else {
			System.out.println("O valor "+ n +" é impar e a sua potencia é " + Math.pow(n, 2));
		}
	
		
	
		
	}
}
