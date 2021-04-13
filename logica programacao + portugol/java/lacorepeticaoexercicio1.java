package PacoteJava;

import java.util.Scanner;

public class lacorepeticaoexercicio1 {

	public static void main(String[] args) {

		int x, quan, npar = 0, nimpar = 0;
		Scanner Leia = new Scanner(System.in);

		for (quan = 1; quan < 11; quan++) {
			System.out.println("\n escreva seu numero: ");
			x = Leia.nextInt();

			if (x % 2 == 0) {

				npar++;
			}

			if (x % 2 != 0) {

				nimpar++;
			}

		}
		System.out.printf("numero de impares %d  ", +nimpar);
		System.out.printf("numero de pares  %d", +npar);
	}
}
