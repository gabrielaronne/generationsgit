//exercicio 5 
programa
{
	
	funcao inicio()
	{
		real ip

		escreva("Leia o indice de poluicao: ")
		leia(ip)

		se (ip>=0.05 e ip<=0.25)
		{
             escreva("indice aceitavel")
		
	}
	senao se (ip>0.25 e ip<=0.3)
          escreva("notificar empresa de primeiro grupo")

	

      senao se (ip>0.3 e ip<0.4)
      escreva ("notificar empresa de primeiro e segundo grupo")

      senao se (ip>0.5)
      escreva ("todos os grupos devem ser notificados")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */