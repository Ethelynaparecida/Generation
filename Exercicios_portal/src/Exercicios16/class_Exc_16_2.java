package Exercicios16;

import java.util.Scanner;

public class class_Exc_16_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 * 
		*/
		
		double numero, x;
		int  contimpar=0, contpar=0;
		
		for(x=1; x<10;x++)
		{
			System.out.println("Digite um valor ");
			numero = leia.nextDouble();
			
						
			if(numero%2==0)
			{
				contpar++;
			}else
			{
				contimpar++;
			}
		}
		System.out.println(" pares = "+contpar+" impares = "+contimpar);
	}

}
