package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String valor = "#";
		for (char sChar = 'a'; sChar <= 'e'; sChar++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//Versão do desafio
		//Não pode usar valor numerico para controlar o laçõ!
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}

}
