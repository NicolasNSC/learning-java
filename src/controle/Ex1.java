package controle;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		//Nicolas 21 de abr. de 2021
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		
		if (num >= 0 && num <=10) {
			if (num % 2 == 0) {
				System.out.printf("O valor %d é valido e é par", num);
			} else {
				System.out.printf("O valor %d é valido e é impar", num);
			}
		} else if(num % 2 == 0){
			System.out.println("O valor não é valido mas é par");
		} else {
			System.out.println("O valor não é valido mas é impar");
		}

		entrada.close();
	}
}
