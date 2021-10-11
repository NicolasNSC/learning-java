package classe.desafioRango;

public class Janta {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Maicon", 99.8);
		Comida c1 = new Comida("Arroz", 0.223);
		Comida c2 = new Comida("Feijão", 0.300);
		
		System.out.println(p.apresentar());
		p.Comer(c1);
		System.out.println(p.apresentar());
		p.Comer(c2);
		System.out.println(p.apresentar());
		
	}
}
