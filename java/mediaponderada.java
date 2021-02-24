package PacoteJava;
import java.util.Scanner;

public class mediaponderada {
	 public static void main (String args[])
     
      { 
    	Scanner ler = new Scanner(System.in);
    	
    	float nota1,nota2,nota3,mp;
    	
    	
    	
    	System.out.println ("escreva soa nota1: ");
    	nota1 = ler.nextFloat();
    	System.out.println("escreva sua nota2: ");
    	nota2 = ler.nextFloat();
    	System.out.println("escreva sua nota3: ");
    	nota3 = ler.nextFloat();
    	
    	
		mp = (nota1*2 + nota2*3+nota3*5) /10;
      
    	System.out.println(mp);
    	
    	  
      }
	} 