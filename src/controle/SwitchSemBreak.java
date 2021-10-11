package controle;

import java.util.Scanner;

public class SwitchSemBreak {

	public static void main(String[] args) {

		// if(bool)...
		// while(bool)...
		// for(;bool;)...

		//Nicolas 20 de abr. de 2021
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a cor da sua faixa:");
		String faixa = entrada.nextLine();


		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sadan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("N�o sei de nada");
			
			entrada.close();
		}
		System.out.println("Fim!");
		
		int idade = 2;
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2: 
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
			
		}
	}
}
