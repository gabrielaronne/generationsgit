package JOO;

public class testefuncionario {

	private static Object objFuncionario;
	private static funcionario variavelLoop;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       funcionario[]  objFuncionario = new funcionario[3];
        
         objFuncionario[0] =new funcionario ("rafael",15000);
        objFuncionario[1]= new funcionario ("carol",120000);
        objFuncionario[2]= new funcionario ("tiago",10000);
        
        for (int x=0;x<=2;x++) {
        	objFuncionario[x].imprimirinfo();

        }
        System.out.println("***************");
        for (funcionario variavelLoop:objFuncionario)
        {
        	variavelLoop.imprimirinfo();
        }
        for (funcionario  variavelLoop:objFuncionario) {
        	variavelLoop.aumentarSalario(10);
        	variavelLoop.imprimirinfo();
        }
        		
        		
	}


	}


