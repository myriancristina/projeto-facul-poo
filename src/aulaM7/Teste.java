package aulaM7;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Isabela de Paula", 02744742120);
        System.out.println(pessoa.toString());
        Funcionario func = new Funcionario("Gabriel Rodrigues", 02744742120, 2345);
        System.out.println(func.toString());
        Supervisor sup = new Supervisor("Marcos Silva", 02744742120, 6784, "financeiro");
        System.out.println(sup.toString());
	}

}
