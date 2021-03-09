programa
{
    //inclue a biblioteca matematica e renomeia para mat
    inclua biblioteca Matematica --> mat

    funcao inicio()
    {
        //Declaração de Variaveis
        cadeia nome
        inteiro idade
        real altura, nota1, nota2, nota3, media




        //Coletando informações das variaveis
        escreva("escreva seu nome: \n")
        leia(nome)
        escreva("escreva sua idade: \n")
        leia(idade)
        escreva("escreva sua altura: \n")
        leia(ltura)


        //coletando notas
        escreva("Digite a primeira nota: \n")
        leia(nota1)
        escreva("Digite a segunda nota: \n")
        leia(nota2)
        escreva("Digite a terceira nota: \n")
        leia(nota3)

        //calculo da media das notas
        media = (nota1+nota2+nota3)/3


        //Apresenta dados coletados

        escreva("Nome: ", nome, " Idade: ", idade, " Altura: ", altura, "com a media: ", mat.arredondar(media,2))

        //mat.arredondar(media,2) a bliblioteca puxa o arredordar e nele tenho que dizer a
        //variavel media e quantas casas apos a virgula usar
   
    
    
    }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 650; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */