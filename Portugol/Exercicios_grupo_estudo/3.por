programa
{
	
	funcao inicio()
	{

		/* Escreve um programa que fique lendo valores numéricos informados pelo 
		 *  usuário. Para cada leitura, **multiplique o número lido por três e 
		 *  imprima a multiplicação no terminal**. Caso o número multiplicado seja 
		 *  maior que 100, o programa deve encerrar. Apresente a soma das multiplicações
		 e contabilize quantas multiplicações foram feitas*/

		 real num, multi =0.0, soma=0.0 
		inteiro cont=0
		
		 
		faca{

			// cada loop o usuario digita um novo valor
		 	escreva("\nDigite um valor: ")
			leia(num) 
			
		 	multi=num*3 
			//somamos os valoes dos produtos
		 	soma = soma + multi  
		 	
			//apresentamos os resultados	
		 	escreva("\nresultado: ", multi)
		 	//contabilizamos quantas vezes o loop foi executado
		 	cont++
		 }enquanto(multi<=100)
		
		 escreva ("\nresultado soma: ", soma)
		 escreva("\ncontagem: ",cont)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 782; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {multi, 13, 13, 5}-{soma, 13, 25, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */