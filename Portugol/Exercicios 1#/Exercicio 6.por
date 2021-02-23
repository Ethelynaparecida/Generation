programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		//6. Construa um programa em c que, tendo como dados 
		//de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
		//escreva a distância entre eles. A fórmula que efetua tal cálculo é:

		//Declaração de variaveis
		
		real raiz, potum, potdois, yum, ydois, xum, xdois

		//coleta de dados
		escreva("escreva X1 \n")
		leia(xum)
		escreva("escreva Y1 \n")
		leia(yum)
		escreva("escreva X2 \n")
		leia(xdois)
		escreva("escreva Y2 \n")
		leia(ydois)

		//calculo do ponto em x
		potum = mat.potencia(xdois - xum, 2.0)
		//calculo do ponto em y
		potdois = mat.potencia(yum - ydois, 2.0)

		//calculo da raiz quadrada
		raiz = mat.raiz(potum + potdois, 2.0)

		escreva("O resultado é: ", raiz)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 778; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */