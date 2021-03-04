package exercicioOOapresentacao;

public class Pessoa {
	private String nome;
	private int idade;
	private String telefone;
	private int Usomedicamento;
	private int Nivelsedentarismo;

	public Pessoa(String nome, int idade, String telefone, int Usomedicamento, int Nivelsedentarismo) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.Usomedicamento = Usomedicamento;
		this.Nivelsedentarismo = Nivelsedentarismo;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getUsomedicamento() {
		return Usomedicamento;
	}

	public void setUsomedicamento(int usomedicamento) {
		Usomedicamento = usomedicamento;
	}

	public int getNivelsedentarismo() {
		return Nivelsedentarismo;
	}

	public void setNivelsedentarismo(int nivelsedentarismo) {
		Nivelsedentarismo = nivelsedentarismo;
	}

}
