package controle;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		//Nicolas 21 de abr. de 2021
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double num2 = entrada.nextDouble();
		
		double media = (num1 + num2) / 2;
		
		if (media >= 7.0) {
			System.out.println("Aprovado");
		} else if (media < 7.0 && media >= 4.0) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		

		entrada.close();
	}
}
