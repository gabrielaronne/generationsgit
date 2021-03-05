package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class colecoes {

	public static void main(String[] args) {
		
		List <Integer> lista = new ArrayList<Integer>();
		
		lista.add(2);
		lista.add(1);
		lista.add(3);
		lista.add(2);
		lista.add(1);
		
		for(Integer listaElementos:lista) 
		{
			System.out.println(listaElementos);
		}
		
		System.out.println("\nRemovendo um elemento da lista");
		lista.remove(0);
		for(Integer listaElementos:lista) 
		{
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = lista.get(0);
		
		System.out.println("O primeiro elemento da lista é: "+primeiroElemento);
		System.out.println("\n");
		for(int i=0;i<lista.size();i++) 
		{
			System.out.println("Elemento: "+lista.get(i));
		}
		
		Collections.sort(lista);
		System.out.println("\nDepois de ordenado...");
		System.out.println(lista);
		System.out.println("\n");
		
		Set <Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(2);
		meuSet.add(3);
		meuSet.add(1);
		meuSet.add(2);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext())
		{
			System.out.println(iMeuSet.next());
		}
		
	}

}
