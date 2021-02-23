programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		
		//Declaração de variaveis
		real notaum, notadois, notatres, mediap //3,3,4

		//Coleta de dados
		escreva("Digite a primeira nota: ")
		leia(notaum)
		escreva("Digite a segunda nota: ")
		leia(notadois)
		escreva("Digite a terceira nota: ")
		leia(notatres)
		
		//calculo de media
		mediap = (notaum*3+notadois*3+notatres*4)/10

		escreva("Media igual a ", mat.arredondar(mediap,2))

		//Condicao para saber se o aluno esta aprovado, reprovado ou de exame
		se (mediap >= 7){
			escreva("Aluno aprovado")
		} senao{
			se (mediap <= 4)
				{
				escreva("Aluno reprovado")
				}
			senao{
				escreva("Aluno de exame")
				}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 711; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */