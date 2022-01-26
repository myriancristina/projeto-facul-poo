package aulaM7;

public class Pessoa {
    private String nome;
    private int Cpf;
    
	@Override
	public String toString() {
		return "Pessoa: " + nome + ", " + Cpf;
	}
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, int cpf) {
		super();
		this.nome = nome;
		Cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return Cpf;
	}
	public void setCpf(int cpf) {
		Cpf = cpf;
	}
}
