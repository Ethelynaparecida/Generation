programa
{
	
	funcao inicio()
	{

		real n1, n2, n3, media, maiormedia = 0.0, somamedia = 0.0, mediageral
		
		inteiro x

		para (x=1;x<=3;x++){
		


		escreva("Digite a primeira nota")
		leia(n1)
		escreva("Digite a segunda nota")
		leia(n2)
		escreva("Digite a terceira nota")
		leia(n3)


		media = (n1+n2+n3)/3
		somamedia=somamedia+media

		se (maiormedia<media){
			maiormedia = media
		}
		}
		mediageral = somamedia/3
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 431; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */