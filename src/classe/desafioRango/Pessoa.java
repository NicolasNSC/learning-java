package classe.desafioRango;

public class Pessoa{

	String nome;
	double peso;
	
	Pessoa(String _nome, double _peso){
		this.nome = _nome;
		this.peso = _peso;
	}
	
	void Comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.pesoDaComida;
		}
	}
	
	String apresentar() {
		return "Olá, eu sou " + this.nome + " e tenho " + peso + " Kgs.";
	}
}

