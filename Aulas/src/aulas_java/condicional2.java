package aulas_java;

import java.util.Scanner;

public class condicional2 {
	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	
	float n1, n2,n3,resul = 0;
	char op;
	
	//por causa de um bug do eclipse pe�a a op antes de qualquer outra leitura
	
	
	System.out.println(" + Soma - Diferen�a * multiplica��o / divis�o");
	System.out.println("Digitie uma op��o");
	
	op = leia.nextLine().charAt(0); //charAt ele seliciona somente um caracter
	System.out.println("entre com o valor: ");
	n1 = leia.nextFloat();
	System.out.println("entre com o valor: ");
	n2 = leia.nextFloat();
	
	
	//pra algo a mais nas op��es usar string e "" nos cases
	
	
	
	switch(op)
	{
	case '+':
		resul = n1+n2;
		break;
	case '-':
		resul = n1-n2;
		break;
	case '*':
		resul = n1*n2;
		break;
	case '/':
		resul = n1/n2;
		break;
		default:
			System.out.println("Op��o invalida");
	}
	System.out.println("Resultado = "+resul);
	
	
}
}