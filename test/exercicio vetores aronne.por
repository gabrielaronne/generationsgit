programa  //exercicio vetores
{
	
	funcao inicio()
	{
		inteiro v[10], x, soma=0, maiorpontuacao=0
          real media
  
  
          media = soma/4

		para (x=0;x<10;x++){

          escreva("jogue o dado:  ")
		leia(v[x])
		soma += v[x] 
		media = soma/10
          se (v[x] == 6 )	
		{
			maiorpontuacao++ 
		}
	
		
       
		
	
   
	}
escreva(" a soma dos resultados dos dado 'e:   ",soma)
escreva(" a media 'e:",media)
escreva(" Maior pontuacao:",maiorpontuacao) 
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