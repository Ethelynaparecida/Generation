programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

	//8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a 
	//percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
	//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo
	//ao consumidor.

		//Declaração de variaveis
		real custofabrica, custodistribuidor, custoimposto


		//Coleta de dados
		escreva("Ola digite o valor de fabrica: ")
		leia (custofabrica)

		//Calculando a porcentagem do distribuidor em cima do valor de fabrica
		custodistribuidor =  28*(custofabrica/100)
		//Calculando a porcentagem do imposto em cima do valor de fabrica
		custoimposto =  45*(custofabrica/100)
		
		//Somando os valores
		custofabrica = custodistribuidor + custoimposto + custofabrica

		
		escreva ("O valor final é de: ", mat.arredondar(custofabrica, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 903; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */