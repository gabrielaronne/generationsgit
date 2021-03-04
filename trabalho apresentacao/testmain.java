package exercicioOOapresentacao;

import java.util.Scanner;

public class testmain {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
        ansiedade ansiedade = new ansiedade(null, 0, null, 0, 0, 0, 0);
        
        System.out.println("digite a sua doenca: 1- depressao / 2-ansiedade / 3-crise de panico");
        int suadoenca = leia.nextInt();
        ansiedade.setSuadoenca(suadoenca);
        
        if( ansiedade.getSuadoenca() ==2) {

		System.out.println("digite seu nome: ");
		String nome = leia.next();
		ansiedade.setNome(nome);

		System.out.println("digite a sua idade: ");
		int idade = leia.nextInt();
		ansiedade.setIdade(idade);

		System.out.println("digite o seu telefone: ");
		String telefone = leia.next();
		ansiedade.setTelefone(telefone);


		System.out.println("digite o seu nivel de agitacao: 1-pouco agitado / 2-agitado ");
		int niveldeagitacao = leia.nextInt();
		ansiedade.setNiveldeagitacao(niveldeagitacao);

		System.out.println("digite o seu nivel de transtorno de ansiedade: 1- pouco ansioso / 2-controlavel ");
		int niveldotranstornosdeansiedade = leia.nextInt();
		ansiedade.setNiveldotranstornosdeansiedade(niveldotranstornosdeansiedade);
		
		ansiedade.Transtornosintensos();
	
	
	}	
	
	
	

	}
	}
