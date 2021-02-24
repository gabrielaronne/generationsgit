package PacoteJava;

import java.util.Scanner;

public class EntradaSaida {
	
      public static void main (String args[])
      {
    	  Scanner ler = new Scanner(System.in);
    	  int a,b,soma;
    	  System.out.println("entre com o valor de a: ");
    	  a = ler.nextInt();
    	  System.out.println("entre com o valor de b: ");
    	  b = ler.nextInt();
          soma=a+b;
          System.out.println(soma);
          
      }
	
	}

