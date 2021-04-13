package exerciciolistapolimorfia;

public class preguica extends Animal {
	
		private String escalar;

		public String escalar() {
			return escalar;
		}

		public void setescalar(String escalar) {
			this.escalar = escalar;
		}
		
		public String getNome() {
			return "preguica : "+super.getNome()+"  idade: "+super.getIdade()+"  emite som:"+super.getSom()+"  consegue escalar?"+this.escalar;
			
			
		}

	}
	