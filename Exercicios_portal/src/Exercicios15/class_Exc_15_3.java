package Exercicios15;
import java.util.Scanner;


	public class class_Exc_15_3 {
		public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
		/* Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto*/
		
		int idade;
		System.out.println("Digite a idade ");
		idade = leia.nextInt();
		
		

		if(idade >= 18){
			
			System.out.println("Adulto");
					
			}else
				if(idade >= 15 && idade <= 17){
				System.out.println("Juvenil ");
							
				}else{
					System.out.println("infantil ");
					}
					
			
		}
		
		
}

	