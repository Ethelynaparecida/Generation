package Exercicios17;

public class class_Exc_17_1 {

	public static void main(String[] args) {
		/* 1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
		 * O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor
 e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/
		
		//int[] a = new int [6];
		int[] a = {1,0,5,-2,-5,7};
		int soma;
		
			soma = a[0]+a[1]+a[5];
			
			System.out.println("O valor da soma é "+soma);
			
			a[3]=100;
			
			for(int x=0;x<=5;x++)
			{
				System.out.println("valor da posição "+x+" é igual a "+a[x]);
			}
			
	}

}
