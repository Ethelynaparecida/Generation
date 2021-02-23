programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		//5. Faça um sistema que leia as 3 notas de um aluno
		//e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 

		//Declaração de variaveis
		real a, b, c, media

		//Coleta de dados
		escreva("ola digite nota 1: ")
		leia (a)
		escreva("ola digite nota 2: ")
		leia (b)
		escreva("ola digite nota 3: ")
		leia (c)

		//calculo dos pesos de cada nota
		a=a*2
		b=b*3
		c=c*5

		//callculo da media proporcional
		media = (a+b+c)/10

		escreva ("Media é igual: ", mat.arredondar(media,2))
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 555; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */