package PacoteJava;

import java.util.Scanner;

public class lacorepeticaoexercicio3 {

	public static void main(String[] args) {

		int numero, somanumero = 0;

		Scanner leia = new Scanner(System.in);

		
		do {

			System.out.println(" insira um numero: ");
			numero = leia.nextInt();

			somanumero = somanumero + numero;

			System.out.printf("\n A soma dos numeros digitados 'e: %d", somanumero);

		} while (numero != 0);

	}

}
