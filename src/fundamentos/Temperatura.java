package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		// (ºF - 32) * 5/9 = ºC
		final int ajuste = 32;
		final double fator =  5.0/9.0;
		
		double F = 38;
		double C = (F - ajuste) * fator;
		System.out.println("O valor de " + F + "ºF convertido em gráus Celsius é " + C + "ºC.");
		
		F = 0;
		C = (F - ajuste) * fator;
		System.out.println("O valor de " + F + "ºF convertido em gráus Celsius é " + C + "ºC.");
	
	}

}
