package aulaM7ParteDois;

public class Teste {

	public static void main(String[] args) {
		Empregado empreg = new Empregado("Caio", "Silva", "02744742120");
		System.out.println(empreg.toString());
		Assalariado assalar = new Assalariado("Breno Júnior", "Barbosa", "02744742120", 3500.00);
		System.out.println(assalar.toString());
		Comissionado comiss = new Comissionado("Maria", "Silveira", "01846770173", 4200.00, 60.0000, 25.0);
		System.out.println(comiss.toString());
		Horista horis = new Horista("Júnior", "Braz", "01846770173", 20, 50.0, 0, 0, 0);
		System.out.println(horis.toString());
	}

}
