package PacoteJava;

import java.util.Scanner;


public class idademediaano2 {


	public static void main(String[] args) {
	

		int anos,meses,dias,total;
		
		Scanner entrada = new Scanner(System.in);
		
		 System.out.println("entre com o total de dias: ");
		 total = entrada.nextInt();
		 
		 anos= total / 365;
		 meses= (total%365)/30;
		 dias= (total%365)%30;
		 
		 System.out.printf ("eu tenho: %d anos(s), %d mes(ses) %d dia(s) ",anos,meses,dias);
		
		 

	}

}
