programa
{
	
	funcao inicio()
	{
		/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.  */

		real salario, filhos, mediafilhos=0.0, mediasalario=0.0, maiorsalario=0.0, pessoa=0.0, porc=0.0
		
		inteiro x

		para (x=1;x<=20;x++){
		


		escreva("Digite o valor do salario ")
		leia(salario)
		escreva("Digite a quantidade de filhos ")
		leia(filhos)
		
		mediafilhos = mediafilhos + filhos
		mediasalario = mediasalario + salario

		

		se (maiorsalario<salario)
		{
			maiorsalario = salario
		}
		se(salario <= 100.00)
		{
			pessoa++
		
		}
				
	}
		mediasalario = mediasalario/20
		mediafilhos = mediafilhos/20
		porc= (pessoa*100)/20
		escreva("Media de salarios: ", mediasalario)
		escreva("\nMaior salario: ", maiorsalario)
		escreva("\nMedia de filhos: ", mediafilhos)
		escreva("\nUm total de ", pessoa, " pessoa(s) recebem ate R$ 100,00 que equivale a ", porc,"% de 20 pessoas")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */