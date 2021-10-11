package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro salario: ");
		String salario1 = entrada.next().replace(",", ".");
		System.out.println("Digite seu segundo salario: ");
		String salario2 = entrada.next().replace(",", ".");
		System.out.println("Digite seu terceiro salario: ");
		String salario3 = entrada.next().replace(",", ".");
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		double soma = s1 + s2 + s3;
		System.out.println("A soma dos salarios é: " + soma + "\nE sua média é de: " +  (soma /3));
		
		entrada.close();
	}

}
