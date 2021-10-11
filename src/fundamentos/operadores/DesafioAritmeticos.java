package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		/*int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);*/
		
		//{ [6 * (3+2)³ / 3*2] - [(1-5) * (2-7) / 2]² }³ / 10³
		
		
		//Primeira parte
		int a = 6* (3+2);
		int b = (int) Math.pow(a, 2);
		int c = b / (3*2);
		System.out.println(c);
		
		//Segunda parte
		int a2 = (1-5) * (2-7);
		int b2 = a2 / 2;
 		int c2 = (int) Math.pow(b2, 2);
		System.out.println(c2);
		
		//Terceira parte
		int a3 = c - c2;
		int b3 = (int) Math.pow(a3, 3);
		int c3 = (int) Math.pow(10, 3);
		int d4 = b3 / c3;
		System.out.println(b3/c3);
		
		System.out.printf("\n (%d - %d)³ / 10³ = %d", c, c2, d4);
	}
		
		

}
