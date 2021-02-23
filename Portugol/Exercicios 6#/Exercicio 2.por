programa
{
	inclua biblioteca Matematica
	 
	funcao inicio()
	{

	//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

	//Declaração de variaveis
		real mestrinta, idade
		inteiro dias, mes, ano


		//Coleta de dados
		escreva("Digite quantos dias \n")
		leia (dias)


		//Calculando a quantidade de anos
		ano = dias / 365
		
		//Coletando o resto de dias
		mes = dias % 365
		//Calculando a uqantidade de meses
		mestrinta = mes /30

		//Calculando o resto de dias
		idade = mes % 30

		escreva("anos ", ano, " meses: ", mestrinta,  "dias ", idade)
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 611; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */