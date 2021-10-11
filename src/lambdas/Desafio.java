package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("Ipad", 3235.89, 0.50);
		
		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto); 	
		
		UnaryOperator<Double> impostoMincipal = preco -> preco >= 2500 ? preco * 1.085 : preco;	
		
		UnaryOperator<Double> frete = f -> f >=3000 ? f + 100 : f + 50;	
				
		
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", "."));
		
		Function<Double, String> formatar = preco -> ("R$" + preco);
		
		String preco = precoFinal
				.andThen(impostoMincipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println("O preco final é " + preco);
		
		
	}

}
