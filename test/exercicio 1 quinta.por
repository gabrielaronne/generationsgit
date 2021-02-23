//primeira parte
programa
{
	
	funcao inicio()
	{
     real  sal,mediasal,somasal=0.0, medianf ,maiorsal=0.0,perc
     inteiro nf, somanf=0,contp100=0,x

    para(x=1;x<=4;x++)	
	{
		escreva("digite o seu salario: ")
		leia(sal)
		escreva("numero de filhos: ")
		leia(nf)
		 
	     somasal= somasal + sal // somar salario
	     somanf= somanf + nf // somar filhos


         se(maiorsal<sal)
	     { 
	     maiorsal=sal
	     }
	  
	    se(sal<=100)
	    {
         contp100++
	    }
	  
	}
	mediasal = somasal/4
	medianf = somanf/4
	perc = (contp100 * 100)/4

	escreva("\nMedia salarial: ",mediasal)
	escreva("\nMedia Numero FIlhos: ",medianf)
     escreva("\nMaior Salario: ", maiorsal)
     escreva("\nPercentual: ",perc)
     
	
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 16; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */