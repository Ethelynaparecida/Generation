programa
{
	
	funcao inicio()
	{
		/* 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório,
		a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo
		valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.*/
		
		real num, somatorio = 0.0, media= 0.0
		inteiro cont=0
		
		escreva("Digite um valor: ")
			leia(num) 
			
		enquanto(num>=0)
		{
			

			somatorio = somatorio + num
			
			
			escreva("entre com numero: ")
			leia(num)
			cont++
		}
		media = somatorio / cont

		
		escreva("\nTotal soma:", somatorio)
		escreva ("\nMedia: ", media)
		escreva("\nTotal de numeros validos digitados: ", cont)
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 770; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */