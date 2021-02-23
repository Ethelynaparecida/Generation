programa
{
	
	funcao inicio()
	{

		real p, eh=0.0, m=0.0

		/*1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de 
		seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento 
		do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que 
		você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na 
		variável E (Excesso) e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com 
		o conteúdo ZERO.
		escreva)*/
		
		escreva("Peso em quilograma: ")
		leia(p)

		se (p>50){
			eh = p-50
			m= (p/50)*4.00

			escreva("O pessoa passou ", eh, " quilogramas e deve pagar R$ ", m, " de multa")
		}senao{
			escreva("O pessoa passou ", eh, " quilogramas e deve pagar R$ ", m, " de multa")
		}
		
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 859; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */