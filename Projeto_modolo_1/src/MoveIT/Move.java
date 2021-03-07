package MoveIT;

import java.util.Scanner;

public class Move {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		//instanciando um objeto do tipo pessoa
		Pessoa p = new Pessoa(null, null, null, 0);
		p.cadastroUsuario();
		
				
		System.out.println(p.toString());
		
		//Salvando as informações de pEssoa Para usuario do tipo Exercicio	
		Exercicios u = new Exercicios(p);
		u.cadaUs();
		
		System.out.println("\n\n\n");
		
		System.out.println(u.toString());
		
		
		//Definindo se os exercicios são para um usuario jovem ou uduario idoso
		if (p.getIdade()<12)
		{
			System.out.println("ops... você ainda não pode fazer esses exercicios");
		}else if(p.getIdade()>11 && p.getIdade()<60) 
		{
			for(int a = 0; a>10; a++)
			{
			
			}
			u.jovem();
				}else {
					System.out.println("idoso");
					u.idoso();
				}
		
		 p.conta2();
	}
		
	
		
	}


