
public class Administrador extends Pessoa {
	
	private int ajudadecusto;
	
	
     public Administrador(String nome, String endereco, String telefone, int ajudadecusto) {
    	 super(nome,endereco,telefone);
    	 this.ajudadecusto=ajudadecusto;
    	 
     }


	public int getAjudadecusto() {
		return ajudadecusto;
	}


	public void setAjudadecusto(int ajudadecusto) {
		this.ajudadecusto = ajudadecusto;
	}
     
}
