package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		// (�F - 32) * 5/9 = �C
		final int ajuste = 32;
		final double fator =  5.0/9.0;
		
		double F = 38;
		double C = (F - ajuste) * fator;
		System.out.println("O valor de " + F + "�F convertido em gr�us Celsius � " + C + "�C.");
		
		F = 0;
		C = (F - ajuste) * fator;
		System.out.println("O valor de " + F + "�F convertido em gr�us Celsius � " + C + "�C.");
	
	}

}
