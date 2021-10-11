package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//Offer e Add -> adicionam elementos na fila
		//Diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana"); //Retorna falso
		fila.offer("Bia"); //Lan�a uma exce��o
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafa");
		fila.offer("Gui");
		
		// Peek e Element -> obter o proximo elemento da fila (sem remover)
		
		//Diferen�a � o comportamento ocorre
		//quando a fila est� vazia  
		System.out.println(fila.peek()); //retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lan�a uma exce��o
		System.out.println(fila.element());
		
		//fila.clear();
		//fila.size();
		//fila.isEmpy();
		//fila.contains(...);
		
		//Poll e remove -> obter o proximo elemento da fila e remove!
		
		//Diferen�a � o comportamento ocorre quando a fila est� vazia!
		System.out.println(fila.poll());//retorna null
		System.out.println(fila.remove());//lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
	}
}
