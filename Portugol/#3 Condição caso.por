programa
{
	
	funcao inicio()
	{
		//Declaração de variavel
		real operador1, operador2, res=0.0
		caracter op


		//Coletad e dados
		escreva("Digite o primeiro valor: ")
		leia(operador1)
		escreva("Digite o segundo valor: ")
		leia(operador2)

		//COleta de Opção
		escreva(" + --> Adção \n - --> Subtração \n * --> Multiplicação \n / --> Divisão")
		escreva("\nEscolha a sua opção: ")
		leia(op)

		//Menu de escolha de opção
		escolha(op){
			caso '+':
			res = operador1+operador2
			pare
			caso '-':
			res = operador1-operador2
			pare
			caso '*':
			res= operador1*operador2
			pare
			caso '/':
			res=operador1/operador2
			pare
			caso contrario:
			escreva("Opção invalida")//caso seja selecionado opção invalida
						
		}
		
		escreva("\nResultado igual a ", res) 

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 117; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */