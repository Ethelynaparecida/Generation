package Exercicios17;

import java.util.Scanner;

public class class_Exc_17_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/* 4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da constante deve ser lido e o 
resultado da adi��o da constante deve ser armazenado na pr�pria matriz.
*/
		
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		int op=0;
		
		for(int linha=0;linha<2;linha++)
		{
			for(int coluna=0;coluna<2;coluna++)
			{
				System.out.printf("\nDigite o valor da posi��o M1=[%d][%d] ",linha+1,coluna+1);
				matriz1[linha][coluna] = leia.nextFloat();
			}
		}
		for(int linha=0;linha<2;linha++)
		{
			for(int coluna=0;coluna<2;coluna++)
			{
				System.out.printf("\nDigite o valor da posi��o M2=[%d][%d] ",linha+1,coluna+1);
				matriz2[linha][coluna] = leia.nextFloat();
			}
		}
		System.out.println("\n\n\n1--> Somar as matrizes;\n2--> Subtrair a primeira matriz da sugunda;\n3--> Adicionar valor as matrizes;\n4--> imprimir as matrizes.");
		System.out.println("Digite o valor da op��o desejada: ");
		op = leia.nextInt();
		
		while(op<1|| op>4)
		{
			System.out.println("Op��o invalida, digite novamente ");
			op = leia.nextInt();
		}
		
		switch(op)
		{
		case 1:
			System.out.println("A soma � igual a: \n");
			for(int linha=0;linha<2;linha++)
			{
				for(int coluna=0;coluna<2;coluna++)
				{
					
					matriz3[linha][coluna] = matriz2[linha][coluna]+ matriz1[linha][coluna];
					System.out.printf(matriz3[linha][coluna]+"  ");
				}
				System.out.println();
			}
			
			break;
			
		case 2:
			System.out.println("A soma � igual a: \n");
			for(int linha=0;linha<2;linha++)
			{
				for(int coluna=0;coluna<2;coluna++)
				{
					
					matriz3[linha][coluna] = matriz1[linha][coluna]- matriz2[linha][coluna];
					System.out.printf(matriz3[linha][coluna]+"  ");
				}
				System.out.println();
			}
			
			break;
			
		case 3:
			System.out.println("A matriz 1 fica igual a:\n");
			for(int linha=0;linha<2;linha++)
			{
				for(int coluna=0;coluna<2;coluna++)
				{
					matriz1[linha][coluna] = matriz1[linha][coluna]+ 10;
					System.out.printf(matriz1[linha][coluna]+"  ");
					
				}
				System.out.println();
			}
			System.out.println("\nA matriz 1 fica igual a:\n");
			for(int linha=0;linha<2;linha++)
			{
				for(int coluna=0;coluna<2;coluna++)
				{
					matriz2[linha][coluna] = matriz2[linha][coluna]+ 10;
					System.out.printf(matriz2[linha][coluna]+"  ");					
				}
				System.out.println();
			}
			break;
		case 4:
			System.out.println("A matriz 1:\n");
			for(int linha=0;linha<2;linha++)
			{
				for(int coluna=0;coluna<2;coluna++)
				{
					System.out.printf(matriz1[linha][coluna]+"  ");					
				}
				System.out.println();
			}
			System.out.println("\nA matriz 2:\n");
			for(int linha=0;linha<2;linha++)
			{
				for(int coluna=0;coluna<2;coluna++)
				{
					System.out.printf(matriz2[linha][coluna]+"  ");					
				}
				System.out.println();
			}
		}
		
	}

}
