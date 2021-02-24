package Pacote_Exercicios_10;

import java.util.Scanner;

public class class_exercicio_3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//3. Faça um sistema que leia o tempo de duração
		//de um evento em uma fábrica expressa em segundos e mostre-o
		//expresso em horas, minutos e segundos.
		
		int segundos, hora, minutos, minuto, cal;
		
		System.out.println("Digite a quantidade de segundos: ");
		segundos = leia.nextInt();
		
		//Calculo da hora
		hora = segundos/3600;
		//caculo dos minutos tirando ja o valos das horas
		minutos = ((segundos - (hora * 3600))/60);
		cal = segundos % 60;
		
		System.out.print("horas "+hora+ " minutos " + minutos+ " segundos " + cal);
		
	}
}
