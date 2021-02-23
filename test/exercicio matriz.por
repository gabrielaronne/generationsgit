programa // exercicio matriz
{
	
	funcao inicio()
	{
		real n1[4][6], n2[4][6], m1 [4][6], m2[4][6]
		inteiro linha, coluna

		para(linha=0;linha<4;linha++)
		{
			para (coluna=0;coluna<6;coluna++)
			{
			escreva ("\nEntre com um valor para N1: ")
		     leia(n1[linha][coluna])
			escreva("\nEntre com um valor para N2: ")
			leia (n2[linha][coluna])
			m1[linha][coluna] = n1 [linha][coluna] + n2 [linha][coluna] 
			m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna]

			escreva("\nSoma [ ",linha,"][",coluna,"]=",m1[linha][coluna])
			escreva("\nDiferenca [ ",linha,"][",coluna,"]=",m2[linha][coluna])
		
			 
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 29; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */