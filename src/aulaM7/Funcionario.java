package aulaM7;

public class Funcionario extends Pessoa{
   private int registro;

public Funcionario() {
	super();
}

public Funcionario(String nome, int cpf, int registro) {
	super(nome, cpf);
	this.registro = registro;
}

@Override
public String toString() {
	return "Funcionario:"+ super.toString() +", " + registro;
}

public int getRegistro() {
	return registro;
}

public void setRegistro(int registro) {
	this.registro = registro;
   }

}
