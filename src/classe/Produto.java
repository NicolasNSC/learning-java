package classe;

public class Produto {

	//Atributo
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//Construtor
	Produto(){
		
	}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	//Metodo
	double precoComDesconto(){
		return preco * (1 - desconto );
	}
	
	double precoComDesconto(double descontoDoGerente){
		double calc = preco * (1 - desconto + descontoDoGerente);
		return calc;
	}
}
