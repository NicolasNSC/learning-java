package controle;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		//Nicolas 21 de abr. de 2021
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int num = entrada.nextInt();
		
		if (num >= 0 && num <=10) {
			if (num % 2 == 0) {
				System.out.printf("O valor %d � valido e � par", num);
			} else {
				System.out.printf("O valor %d � valido e � impar", num);
			}
		} else if(num % 2 == 0){
			System.out.println("O valor n�o � valido mas � par");
		} else {
			System.out.println("O valor n�o � valido mas � impar");
		}

		entrada.close();
	}
}
