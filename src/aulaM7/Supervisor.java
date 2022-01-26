package aulaM7;

public class Supervisor extends Funcionario {
	private String departamento;

	public Supervisor(String nome, int cpf, int registro, String departamento) {
		super(nome, cpf, registro);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Supervisor=" + super.toString() +", "+ departamento +", "+ departamento + "]";
	}
	

}
