package aulaM7ParteDois;

public class Assalariado extends Empregado {
	private double salario;

	@Override
	public String toString() {
		return "Assalariado: " + super.toString() + ", " + salario;
	}

	public Assalariado() {
		super();
	}

	public Assalariado(String nome, String sobrenome, String cpf, double salario) {
		super(nome, sobrenome, cpf);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
