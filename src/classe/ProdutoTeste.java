package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		
		Produto.desconto = 0.50;
		
		var p2 = new Produto("Caneta Preta", 12.56);
		
		System.out.println(p2.nome + " " + p1.precoComDesconto());
		System.out.println(p1.nome + " " + p2.precoComDesconto());
		
		double pf1 = p1.precoComDesconto();
		double pf2 = p2.precoComDesconto();
		
		
		
		double media = (pf1 + pf2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", media);
		
		System.out.println();
	}
}
