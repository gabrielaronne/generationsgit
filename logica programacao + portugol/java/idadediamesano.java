package PacoteJava;
import java.util.Scanner;

public class idadediamesano {
	
      public static void main (String args[])
      {
    	  Scanner ler = new Scanner(System.in);
    	  int a,b,c,total;
    	  System.out.println("entre com sua idade em dias: ");
    	  a = ler.nextInt();
    	  System.out.println("entre com  sua idade em meses: ");
    	  b = ler.nextInt();
    	  System.out.println("entre com  sua idade em anos: ");
    	  c = ler.nextInt();
          total=a+(b*30)+(c*365);
          System.out.println(total);
          
      }
	
	}
