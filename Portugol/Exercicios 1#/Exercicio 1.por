programa
{

	
	funcao inicio()
	{

	//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

		//Declaração de variaveis
		inteiro ano, bissexto, mestrinta, dias, mes, idade

		//Coleta de dados
		escreva("Digite quantos anos \n")
		leia (ano)
		escreva("Digite quantos meses \n")
		leia (mes)
		escreva("Digite digite quantos dias \n")
		leia (dias)

		//calculo de quantidades mes
				
		//calculo de meses + meses de 31
		mes = mes * 30 + (mes /2)
		//Descobrindo a quantidade de anos bissextos
		bissexto = ano / 4
		//calculando o ano
		idade = ano * 365
		//Somando a quantidade de dias		
		idade = idade + mes + dias + bissexto

		escreva ("sua idade em dias é igual a ", idade)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 658; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */