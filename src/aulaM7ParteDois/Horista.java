package aulaM7ParteDois;

public class Horista extends Empregado {
	private double precoHora;
	private double horasTrabalhadas;
	
	
	public Horista(String nome, String sobrenome, String cpf, double salario, double totalVenda, double taxaComissao, double precoHora, double horasTrabalhadas) {
		super(nome, sobrenome, cpf);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getPrecoHora() {
		return precoHora;
	}
	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	@Override
	public String toString() {
		return "Horista = " + super.toString() + precoHora + ", " + horasTrabalhadas;
	}
	
	

}
