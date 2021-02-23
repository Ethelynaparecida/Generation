programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		real a, b, c, d, eh, f, x, y 
		
		escreva("ola digite a: ")
		leia (a)
		escreva("ola digite b: ")
		leia (b)
		escreva("ola digite c: ")
		leia (c)
		escreva("ola digite d: ")
		leia (d)
		escreva("ola digite e: ")
		leia (eh)
		escreva("ola digite f: ")
		leia (f)

		x = ((c*eh)-(b*f))/ ((a*eh)-(b*d))
		y = ((a*f)-(c*d))/ ((a*eh)-(b*d))

		escreva("X igual: ", mat.arredondar(x, 2), " Y igual: ", mat.arredondar(y, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */