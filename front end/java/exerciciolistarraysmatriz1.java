package PacoteJava;

import java.util.Scanner;

public class exerciciolistarraysmatriz {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int contador = 0;
		Scanner entrada = new Scanner(System.in);

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("insira um numero: N[%d] [%d] : ", linha + 1, coluna + 1);
				matriz[linha][coluna] = entrada.nextInt();

				if (matriz[linha][coluna] > 10) {

					contador++;
				}

			}

		}
		System.out.printf("O numero de valores maior que 10 'e : %d", contador);
	}

}
