programa
{
	
	funcao inicio()
	{

		/* 7) Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). 
		 *  Em caso afirmativo, calcular a área do triângulo.
*/
		//Declaração de variaveis
		real base, altura, area
		//coleta de dados
		escreva("Digite o valor da base: ")
		leia(base)
		escreva("Digite o valor da altura: ")
		leia(altura)

		
		se( base >0 e altura >0)
		{
		area = (base*altura)/2//calculo de area de um tringulo
		escreva("A area do triangulo é de ", area)
		
		}senao{
			escreva("valores incorretos")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 598; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */