package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class colecoes2 {
	public static void main(String[] args)
	{
		int op;
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n digite uma opcao: ");
			System.out.println("-----------------");
			System.out.println(" 1 Deseja adicionar produtos ao estoque\n 2 Deseja remover\n 3 Atualizar\n 4 Mostrar todos os produtos do estoque\n 0 Encerrar o programa");
			System.out.println("----------------");
			op = ler.nextInt();
			switch(op)
			{
			case 1:
				ler.nextLine();
				System.out.println("Digite o produto para adicionar ao estoque:");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			case 2:
				ler.nextLine();
				System.out.println("Digite o produto para remover do estoque:");
				String produtor = ler.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("produto não existe");
				}
			case 3:
				ler.nextLine();
				System.out.println("digite o produto que quer trocar:");
				String verifica = ler.nextLine();
				System.out.println("Digite o nome do produto que trocara no lugar de"+verifica+": ");
				String novo = ler.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("produto não existe");
				}
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("\n os produtos do estoque:");
				System.out.println(estoque);
				break;
				default:
					System.out.println("finalizou o programa");
			}
		}while(op!=0);
		
	}
}
