package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
	
		//Nicolas 20 de abr. de 2021
		Scanner entrada = new Scanner(System.in);

		
		

		
		
		String conceito = "";
		System.out.println("Informe a nota: ");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:{
			conceito = "B";
			break;
		}
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
		default:
			conceito = "n�o informado";
			break;
		}
		
		
		System.out.println("Conceito � " + conceito);
		entrada.close();
	}
}
