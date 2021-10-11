package fundamentos;

public class Inferencia {
	
	/*
	Ao definir uma vari�vel somente utilizando o atributo "var" ela automaticamente infere o seu tipo recebido determinando seu tipo primitivo:
	*/
	
	public static void main(String[] args) {
		
		double a = 4.5; //Declara��o e inicializa��o
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
		N�o podemos modificar o tipo primitivo de uma vari�vel j� criada, porem podemos modificar seu valor armazenado desde que n�o seja uma constante.
		 */
		
		double d; // Vari�vel foi declarada
		d = 123.65; // Vari�vel foi inicializada
		System.out.println(d); // Vari�vel foi usada!
		
		/*var e;
		e = 123.45;
		System.out.println(e);
		*/ //Erro. N�o � poss�vel usar 'var' na vari�vel sem inicializador.
		
		/*
		var f = 12;
		f = 12.01;
		System.out.println(f);
		*/
		//Um numero inteiro n�o pode virar numero float, mas um numero float pode virar um numero inteiro
	
		var f = 12.01;
		f = 12;
		System.out.println(f);
	}
}
