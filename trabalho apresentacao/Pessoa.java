package exercicioOOapresentacao;

public class Pessoa {
	private String nome;
	private int idade;
	private String telefone;
	private int suadoenca;
	

	public Pessoa(String nome, int idade, String telefone,int suadoenca) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.suadoenca=suadoenca;
		

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

	public int getSuadoenca() {
		return suadoenca;
	}

	public void setSuadoenca(int suadoenca) {
		this.suadoenca = suadoenca;
	}

	

}
