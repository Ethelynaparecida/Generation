programa
{
	
	funcao inicio()
	{

		/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas 
	trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
	Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variáve
	l E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final
	do processamento imprimir o salário total e o *salário excedente.
		*/


		real n, eh=0.0, re
		caracter c
		
		escreva("Digite o codigo: ")
		leia(c)


		escreva( "Digite a quantidade de horas: ")
		leia(n)

		se(n>50){
			eh = n-50
			n= 50*10.00
			eh = eh*20
			re = n + eh

			escreva("Codigo: ", c, " trabalhou 50 h e recebera R$ ",re , " com R$ ", eh, " de horas extras") 
		}
		senao{
			re = n*10.0
			escreva("Codigo: ", c, " trabalhou ", n, " horas e recebera R$ ", re, " mais R$ ", eh, " de horas extras")
		}
		
			
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 944; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */