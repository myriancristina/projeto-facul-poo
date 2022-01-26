package aulaM7ParteDois;

public class Comissionado extends Empregado {
	private double totalVenda;
	private double taxaComissao;
	
	public Comissionado(String nome, String sobrenome, String cpf, double salario, double totalVenda, double taxaComissao) {
		super(nome, sobrenome, cpf);
		this.totalVenda = totalVenda;
		this.taxaComissao = taxaComissao;
	}
	public double getTotalVenda() {
		return totalVenda;
	}
	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}
	public double getTaxaComissao() {
		return taxaComissao;
	}
	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}
	@Override
	public String toString() {
		return "Comissionado = " + super.toString() + totalVenda + ", " + taxaComissao;
	}
}
