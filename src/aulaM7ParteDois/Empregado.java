package aulaM7ParteDois;

public class Empregado {
	private String nome;
	private String sobrenome;
	private String Cpf;
	
	@Override
	public String toString() {
		return "Empregado: " + nome + ", " + sobrenome + ", " + Cpf;
	}
	
	public Empregado() {
		super();
	}

	public Empregado(String nome, String sobrenome, String cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		Cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
}
