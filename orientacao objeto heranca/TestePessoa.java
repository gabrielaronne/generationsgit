
public class TestePessoa {


	public static void main(String[] args) {
		Pessoa Rafael = new Pessoa("Rafael","Av.Saopaulo N 343 ","11-3313-6720");
		funcionario Pedro = new funcionario("Pedro","Av.Bauru n342","11-33136721","setor Alfa",1500,7,1);
        Administrador Rebeca = new Administrador ("Rebeca","Av.RiodeJaneiro n341","11-33136723",1600);
//test pessoa //	
	
    System.out.println("Test de pessoas: \n");
    System.out.println(Rafael.getEndereco());
	System.out.println(Rebeca.getEndereco());
	System.out.println(Pedro.getEndereco());
	
	//test funcionario//
	
	System.out.println("\ntest de funcionario: \n");
	System.out.println(Pedro.getCalculasalario());
	System.out.println(Pedro.getImpostos());
	System.out.println(Pedro.getSalariobase());
	System.out.println(Pedro.getSetor());
	
	// test Administrador //
	System.out.println("\n test de administradores: \n");
	System.out.println(Rebeca.getAjudadecusto());
	

	
	}
}