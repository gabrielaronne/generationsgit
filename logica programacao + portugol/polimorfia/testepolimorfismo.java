package exerciciolistapolimorfia;

public class testepolimorfismo {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("tadeu");
		cachorro.setIdade(10);
		cachorro.setSom("auau, auau, auau, auau, auau");
		cachorro.setCorrer("este animal pode correr");
		
		cavalo cavalo = new cavalo ();
		cavalo.setNome("claudio");
		cavalo.setIdade(20);
		cavalo.setSom("Hiin in in,Hiin in in,Hiin in in");
		cavalo.setCorrer("esse animal consegue correr");
		
		preguica preguica = new preguica();
		preguica.setNome("gabriel");
		preguica.setIdade(16);
		preguica.setSom("uhhhh, uhhhh, uhhh");
		preguica.setescalar("este animal consegue escalar arvores");
		

		Animal[] animal = new Animal[3];
		animal[0]=cachorro;
		animal[1]=cavalo;
		animal[2]=preguica;
		
		for (Animal animais:animal) {
			
			System.out.println(animais.getNome());
		}
		
	}

}
