package exerciciolistapolimorfia;

public class Cachorro extends Animal{
	private String correr;

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public String getNome() {
		return "cachorro : "+super.getNome()+"  idade: "+super.getIdade()+"  emite som:"+super.getSom()+"  consegue correr?"+this.correr;
		
		
	}

}
