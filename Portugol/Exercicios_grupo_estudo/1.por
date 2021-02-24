programa
{
	
	funcao inicio()
	{

		/* Crie um algoritmo em português estruturado que leia um número no
formato (CDU – Centena, Dezena e Unidade) e imprima invertido: UDC.
(Exemplo: 345, sairá 543). O número deverá ser armazenado em outra variável
antes de ser impresso.*/

		
		inteiro c=0, d=0, u=0, num

		escreva("digite um valor menor que 1000: ")
		leia (num)


		//Condição pra garantir que o usuario nao digite um valor invalido
		se(num<1000)
		{
			//isolando cada valor em uma variavel
			c = num / 100
			d = (num- (c*100)) /10 
			u = ( num - (c*100) )- (d *10)

			//apresentando os valores invertidos
			escreva (u, " ", d, " ", c)
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 655; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */