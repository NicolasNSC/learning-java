package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Ler num1
		//Ler num2
		// + ou * / %
		
		System.out.println("Calculadora b�sica");
		
		System.out.print("\nDigite um n�mero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("\nDigite outro n�mero n�mero: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("\nDigite a opera��o desejada: ");
		String op = entrada.next();
		
		
		//
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f",  num1, op, num2, resultado);
		entrada.close();
		
		
	}

}
