
public class funcionario extends Pessoa {
	
	private String Setor;
	private float salariobase;
	private float impostos;
	private float calculasalario;
	
	public funcionario(String nome,String endereco,String telefone,String Setor, float salariobase, float impostos,float calculasalario) {
		super(nome,endereco,telefone);
		this.Setor=Setor;
		this.salariobase=salariobase;
		this.impostos=impostos;
		this.calculasalario=salariobase-impostos/100*salariobase;
	}


	public String getSetor() {
		return Setor;
	}


	public void setSetor(String setor) {
		Setor = setor;
	}


	public float getSalariobase() {
		return salariobase;
	}


	public void setSalariobase(float salariobase) {
		this.salariobase = salariobase;
	}


	public float getImpostos() {
		return impostos;
	}


	public void setImpostos(float impostos) {
		this.impostos = impostos;
	}


	public float getCalculasalario() {
		return calculasalario;
	}


	public void setCalculasalario(float calculasalario) {
		this.calculasalario = calculasalario;
	}

}
