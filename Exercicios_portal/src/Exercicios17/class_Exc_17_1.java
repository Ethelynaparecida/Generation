package Exercicios17;

public class class_Exc_17_1 {

	public static void main(String[] args) {
		/* 1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. 
		 * O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor
 e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/
		
		//int[] a = new int [6];
		int[] a = {1,0,5,-2,-5,7};
		int soma;
		
			soma = a[0]+a[1]+a[5];
			
			System.out.println("O valor da soma � "+soma);
			
			a[3]=100;
			
			for(int x=0;x<=5;x++)
			{
				System.out.println("valor da posi��o "+x+" � igual a "+a[x]);
			}
			
	}

}
