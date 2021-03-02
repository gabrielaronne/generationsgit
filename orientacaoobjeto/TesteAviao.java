package JOO;

public class TesteAviao {
public static void main (String args[]) { 
	
	aviao meuaviao = new aviao ();
	meuaviao.cor = "branco";
	meuaviao.Versao = "2.0";
	meuaviao.velocidadeAtual = 0;
    meuaviao.Velocidademaxima = 200;
    
    meuaviao.liga();
    
	
	meuaviao.acelera(50);
	
	
	System.out.println(meuaviao.velocidadeAtual);
	System.out.println(meuaviao.Versao);
	System.out.println(meuaviao.cor);
	System.out.println(meuaviao.Velocidademaxima);
	
	
	
	
}
}
