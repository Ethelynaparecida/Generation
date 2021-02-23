programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{


		/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */

	real n1,  n2, n3, n4, p1, p2, p3, p4
	
		escreva("Digite o valor 1: ")
		leia(n1)
		escreva("Digite o valor 2: ")
		leia(n2)
		escreva("Digite o valor 3: ")
		leia(n3)
		escreva("Digite o valor 4: ")
		leia(n4)

		p3 = mat.potencia(n3, 2.0)

		se (p3 >= 1000){
			escreva ("valor 3: ", p3)
			
		} senao{
			p1 = mat.potencia(n1, 2.0)
			p2 = mat.potencia(n2, 2.0)
			p3 = mat.potencia(n3, 2.0)
			p4 = mat.potencia(n4, 2.0)
			escreva ("valor 1: ",n1, ", ", p1, "\nvalor 2: ",n2, ", ", p2, "\nvalor 3: ",n3, ", ", p3, "\nvalor 4: ",n4, ", ", p4 )
			
			
		}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 601; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */