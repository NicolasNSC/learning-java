package oo.composicao.desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Maria");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);
		
		Compra compra2 = new Compra();
		compra1.adicionarItem("Caderno", 10.00, 10);
		compra1.adicionarItem(new Produto("Impresso", 998.90), 1);
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
		
		
	}

}
