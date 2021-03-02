package JOO;

public class aviao {
	String cor;
	String Versao;
	double velocidadeAtual;
	double Velocidademaxima;
	
	void liga(){
      
		System.out.println("O aviao esta decolando...");
}
 void acelera(double quantidade) {
	 
	 double velocidadeNova = this.velocidadeAtual+quantidade;
	 this.velocidadeAtual=velocidadeNova;
	 
	 
 }
	int PegaMarcha ()
	{
		if (this.velocidadeAtual<0) {
                     return -1;				
	}
		if(this.velocidadeAtual>=0  && this.velocidadeAtual<80) {
			return 1;
		}
		if (this.velocidadeAtual>=80 && this.velocidadeAtual<200) {
			return 2;
		}
		return 3;
}      
	}