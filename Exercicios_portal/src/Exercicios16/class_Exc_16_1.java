package Exercicios16;

import java.util.Scanner;

public class class_Exc_16_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		/*1-Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)*/
		
		float resto, i, divi;
		
		for(i=1000; i <=1999; i ++ )
		{
			resto = i % 11;
			
			if(resto==5)
			{
					System.out.println(resto+" = "+i);
			}
		}
	}
}
