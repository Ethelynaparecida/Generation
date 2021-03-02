package Exercicios17_POO;

import java.util.Scanner;

public class dadosAviao {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		
		aviao aviao1 = new aviao();
		System.out.println("Digite a data do voo: ");
		aviao1.setDataVoo(leia.next());
		System.out.println("Digite o numero do voo: ");
		aviao1.setNumeroVoo(leia.next());
		System.out.println("Digite seu o numero de serie da aeronave");
		aviao1.setSerieAeronave(leia.next());
		
		System.out.print(aviao1.getDadosVoo());

	}

}
