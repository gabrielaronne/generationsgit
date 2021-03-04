package exercicioOOapresentacao;

import java.util.Scanner;

public class testmain {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ansiedade ansiedade = new ansiedade(null, 0, null, 0, 0, 0, 0);

		System.out.println("digite seu nome: ");
		String nome = leia.next();
		ansiedade.setNome(nome);

		System.out.println("digite a sua idade: ");
		int idade = leia.nextInt();
		ansiedade.setIdade(idade);

		System.out.println("digite o seu telefone: ");
		String telefone = leia.next();
		ansiedade.setTelefone(telefone);

		System.out.println(
				"digite a frequencia que vc faz uso de medicamentos: 1-com pouca frequencia / 2- frequencia / 3- com muita frequencia");
		int Usomedicamento = leia.nextInt();
		ansiedade.setUsomedicamento(Usomedicamento);

		System.out
				.println("Digite o seu nivel de sedentarismo: 1- pouco sedentario / 2-sedentario / 3-muito sedentario");
		int Nivelsdentarismo = leia.nextInt();
		ansiedade.setNivelsedentarismo(Nivelsdentarismo);

		System.out.println("digite o seu nivel de agitacao: 1-pouco agitado / 2-agitado ");
		int niveldeagitacao = leia.nextInt();
		ansiedade.setNiveldeagitacao(niveldeagitacao);

		System.out.println("digite o seu nivel de transtorno de ansiedade: 1- pouco ansioso / 2-controlavel ");
		int niveldotranstornosdeansiedade = leia.nextInt();
		ansiedade.setNiveldotranstornosdeansiedade(niveldotranstornosdeansiedade);
		
		ansiedade.Transtornosintensos();
	
	
	}	
	
	
	

	
	}
