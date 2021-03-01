package PacoteJava;

import java.util.Scanner;

public class exerciciolistarraysvetores {

	public static void main(String[] args) {
		int[] vetor = new int[6];
		int somapar = 0, somaimpar = 0;
		;

		Scanner entrada = new Scanner(System.in);

		for (int x = 0; x < 6; x++) {

			System.out.println("insira aqui o seu numero: ");
			vetor[x] = entrada.nextInt();

			if (vetor[x] % 2 == 0) {

				System.out.println("\n esse numero e par");
				somapar = somapar + vetor[x];
			}

			if (vetor[x] % 2 != 0) {

				System.out.println("\n esse numero e impar");
				somaimpar++;

			}

		}
		System.out.printf("\n a somatoria dos numeros pares 'e : %d", somapar);

		System.out.printf("\n a quantidade de numeros impares digitados  'e : %d    ", somaimpar);
	}

}
