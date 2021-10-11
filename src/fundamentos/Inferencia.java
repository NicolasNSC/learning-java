package fundamentos;

public class Inferencia {
	
	/*
	Ao definir uma variável somente utilizando o atributo "var" ela automaticamente infere o seu tipo recebido determinando seu tipo primitivo:
	*/
	
	public static void main(String[] args) {
		
		double a = 4.5; //Declaração e inicialização
		System.out.println(a);
		/*
		a = "texto"; //erro 
		System.out.println(a);
		*/
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		/*
		Não podemos modificar o tipo primitivo de uma variável já criada, porem podemos modificar seu valor armazenado desde que não seja uma constante.
		 */
		
		double d; // Variável foi declarada
		d = 123.65; // Variável foi inicializada
		System.out.println(d); // Variável foi usada!
		
		/*var e;
		e = 123.45;
		System.out.println(e);
		*/ //Erro. Não é possível usar 'var' na variável sem inicializador.
		
		/*
		var f = 12;
		f = 12.01;
		System.out.println(f);
		*/
		//Um numero inteiro não pode virar numero float, mas um numero float pode virar um numero inteiro
	
		var f = 12.01;
		f = 12;
		System.out.println(f);
	}
}
