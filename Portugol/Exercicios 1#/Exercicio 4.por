programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		//4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
 		//d = (R+s)/2, onde r= (a+b)^2 s=(b+c)^2

 		//Declaração de variaveis
		real a, b, c, r, s, d, potencia=0.0
		
 		//Coleta de dados
		escreva("ola digite o valor a: ")
		leia (a)
		escreva("ola digite o valor b: ")
		leia (b)
		escreva("ola digite o valor c: ")
		leia (c)


		//Calculos das potencias
		r = mat.potencia(a+b, 2.0)
		s = mat.potencia(b+c, 2.0)
	
		d = (r+s)/2

		escreva ("Valor de R: ", r, ", valor de S: ", s, ", Valor de D: ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 463; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */