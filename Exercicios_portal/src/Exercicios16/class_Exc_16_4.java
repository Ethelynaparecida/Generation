package Exercicios16;

import java.util.Scanner;

public class class_Exc_16_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/* Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
		 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
*/
		
		int idade, sexo, comportamento, i=0, contComportamento=0, femiNerv=0, mascAgressivo=0, outrosCalmos=0, adultosNervosos=0, jovensCalmos=0;
		
		while(i<=3)
		{
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			System.out.print("Digite \n1 para feminino\n2 para masculino\n3 para outros ");
			sexo = leia.nextInt();
			System.out.print("Digite \n1 para calmo(a)\n2 para nervoso(a)\n3 para agressivo(a) ");
			comportamento = leia.nextInt();
			
						
			
			if (comportamento==1) {
				
				contComportamento++;
			}
			if(sexo == 1 && comportamento == 2)
			{
				femiNerv++;
			}
			if(sexo==2 && comportamento ==3)
			{
				mascAgressivo++;
			}
			if(sexo==3 && comportamento==1)
			{
				outrosCalmos++;
			}
			if(comportamento==2 && idade >40)
			{
				adultosNervosos++;
			}
			if(comportamento == 1 && idade <18)
			{
				jovensCalmos++;
			}
			
			i++;
		}
		
		System.out.println("/nNumero total de pessoas calmas: "+contComportamento);
		System.out.println("Numero de mulheres nervosas: "+femiNerv);
		System.out.println("Numero de homens agressivos: "+mascAgressivo);
		System.out.println("Numero de outros calmos: "+outrosCalmos);
		System.out.println("Numero total de adultos nervosos: "+adultosNervosos);
		System.out.println("Numero total de jovens calmos: "+jovensCalmos);
		

	}

}
