package Exercicios17;

import java.util.Scanner;

public class class_Exc_17_2 {

	public static void main(String[] args) {
		/* 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
*/	
		Scanner leia = new Scanner(System.in);
		int[] a = new int [6];
		int[] par = new int [6];
		int[] impar = new int [6];
		int soma=0, contpar=0, contimpar=0, x=0;
				
			for( x = 0; x<=5; x++)
			{
				System.out.println("Digite um valor");
				a[x]=leia.nextInt();
				
				if(a[x]%2==0)
				{
					soma =soma+a[x];
					par[contpar]=a[x];
					contpar++;
					
				}
				
				if(a[x]%2!=0)
				{
				
					impar[contimpar]=a[x];
					contimpar++;
					
					
				}
				
			}
			
			x=0;
			while(x<contpar)
			{
				System.out.println("Os valores pares s�o "+ par[x]);
				x++;
			}
			
					
			System.out.println("A soma dos valores pares � igual a "+soma);
			x=0;
			while (x<contimpar)
			{
				System.out.println("Os valores pares s�o "+ impar[x]);
				x++;
			
			}
			

	}

}
