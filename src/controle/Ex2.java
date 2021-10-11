package controle;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int num = entrada.nextInt();

		if (num % 4 == 0) {
			if (num % 100 == 0) {
				if (num % 400 == 0) {
					System.out.println("O ano é bissexto (tem 366 dias).");
				}
			} else
				System.out.println("O ano é bissexto (tem 366 dias).");
		} else
			System.out.println("O ano não é um ano bissexto (tem 365 dias).");

		entrada.close();
	}
}
