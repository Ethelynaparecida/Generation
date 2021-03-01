package Exercicios17;

import java.util.Scanner;

public class class_Exc_17_3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/* 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 
*/
		float [][] matriz = new float[3][3];
		int cont=0;
		
		for(int linha=0; linha<3;linha++)
		{
			for(int coluna=0; coluna < 3; coluna++)
			{
				System.out.println("Digite um valor: ");
				matriz[linha][coluna]=leia.nextFloat();
				
				if(matriz[linha][coluna]>10)
				{
					cont++;
				}
			}
		}
		System.out.println("Foram digitados "+cont+" numeros maiores que 10");
	}

}
