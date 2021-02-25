package aulas_java;

import java.util.Scanner;

public class condicionais1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float n1, n2,n3,ma;
		System.out.println("entre com o valor: ");
		n1 = leia.nextFloat();
		System.out.println("entre com o valor: ");
		n2 = leia.nextFloat();
		System.out.println("entre com o valor: ");
		n3 = leia.nextFloat();
		
		ma = (n1+n2+n3)/3;
		
		System.out.println("media igual a: "+ Math.round(ma));
		
		//printf("media é %2.2f", ma) fazendo o arrendondamento f pq a variavel e float
		
		if (ma>=7 && ma <=10)
		{
			System.out.println("aluno aprovado");
			
		}else 
			if(ma<7 && ma >=4)
		{
			System.out.println("aluno de exame");
		}else
		{
			System.out.println("aluno reprovado");
		}

	}

}
