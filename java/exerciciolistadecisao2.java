package PacoteJava;

import java.util.Scanner;

public class exerciciocondicional2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float num;
		double raiz, x = 0;

		System.out.println("escreva um numero");
		num = ler.nextFloat();

		if (num % 2 == 0) {
			x = Math.sqrt(num);
		}
		if (num % 2 != 0) {
			x = Math.pow(num, 2);
		}

		System.out.println("o resultado e de  " + x);
	}
}
