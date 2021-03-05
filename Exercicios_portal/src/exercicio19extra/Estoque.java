package exercicio19extra;
import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	
		public static void main(String[] args)
		{
			int opc;
			Scanner leia = new Scanner(System.in);
			
			ArrayList<String> estoque = new ArrayList();
			
			do
			{
				System.out.println("\nDigite uma opção:\n1->Deseja adicionar produtos ao estoque;\n2-> Remover produto;\n3-> Atualizar produto\n4-> Exibir todos os produtos do estoque\n0-> Fechar o programa\n\n");
				
				opc = leia.nextInt();
				switch(opc)
				{
				case 1:
					leia.nextLine();
					System.out.println("Digite o produto que deseja adicionar:");
					String produto = leia.nextLine();
					estoque.add(produto);
					break;
				case 2:
					leia.nextLine();
					System.out.println("Digite o produtoque deseja remover:");
					String produtor = leia.nextLine();
					if(estoque.contains(produtor))
					{
						estoque.remove(produtor);
					}
					else
					{
						System.out.println("Produto não encontrado!");
					}
				case 3:
					leia.nextLine();
					System.out.println("Digite o produto que quer atualizar:");
					String verifica = leia.nextLine();
					System.out.println("Digite o nome do produto que entrará no lugar de"+verifica+": ");
					String novo = leia.nextLine();
					if(estoque.contains(verifica))
					{
						estoque.remove(verifica);
						estoque.add(novo);
					}
					else
					{
						System.out.println("Produto não encontrado!");
					}
					System.out.println(estoque);
					break;
				case 4:
					System.out.println("\nOs produtos que estão em estoque:");
					System.out.println(estoque);
					break;
					default:
						System.out.println("Fechou o programa");
				}
			}while(opc!=0);
			
		}
	}

