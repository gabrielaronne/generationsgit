package PacoteJava;

import java.util.Scanner;

public class exercicio2lacorepeticao {

	public static void main(String[] args) {

		int idade, soma21anos = 0, soma50anos = 1;
		Scanner leia = new Scanner(System.in);

		System.out.println("escreva aqui uma idade: ");
		idade = leia.nextInt();

		while (idade != -99) {
			System.out.println("escreva aqui uma idade: ");
			idade = leia.nextInt();

			if (idade > 1 && idade < 22) {
				soma21anos++;

			}
			if (idade > 49) {

				soma50anos++;

			}
		}
		System.out.printf("\n o numero de jovens 'e: %d", soma21anos);
		System.out.printf("\n O numero de adultos : %d", soma50anos);
		idade = leia.nextInt();

	}
}
