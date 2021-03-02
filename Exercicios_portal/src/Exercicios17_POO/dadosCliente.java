package Exercicios17_POO;

import java.util.Scanner;

public class dadosCliente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		cliente cliente1 = new cliente();
		System.out.println("Digite seu nome");
		cliente1.setPrimeiroNome(leia.next());
		System.out.println("Digite seu sobrenome");
		cliente1.setUltimoNome(leia.next());
		System.out.println("Digite seu CPF");
		cliente1.setNumeroCpf(leia.next());
		
		System.out.print(cliente1.getDadosCliente());
		
		
	}

}
