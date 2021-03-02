package JOO;
import java.text.NumberFormat;
public class funcionario {
	private String nome;
	private double salario;
	
	public funcionario (String n, double s) {
		this.nome=n;
		this.salario=s;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
public void aumentarSalario (double percentual) {
	salario *= 1+percentual/100;// salario
}

public String formatarMoeda() 
{
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	nf.setMinimumFractionDigits(2);
	String formatoMoeda = nf.format(salario);
	return formatoMoeda;
}

public void imprimirinfo() {
	System.out.println(nome+"  "+"salario: "+this.formatarMoeda());
}
	

	}


