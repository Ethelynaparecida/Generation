programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{


		//3. Faça um sistema que leia o tempo de duração
		//de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		
		//Declaração de variaveis
		inteiro segundos, hora, minutos, minuto, cal
		
		//Coletando dados
		escreva("escreva a quantidade de segundos: \n")
		leia(segundos)

		
		//Calculo da hora
		hora = segundos/3600
		//caculo dos minutos tirando ja o valos das horas
		minutos = ((segundos - (hora * 3600))/60)
		cal = segundos % 60
		


		escreva ("minutos ", minutos,"\n horas ", hora, "\n segundos ", cal)
	
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