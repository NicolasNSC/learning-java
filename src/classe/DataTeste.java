package classe;

public class DataTeste{

	public static void main(String[] args) {
	
		Data t1 = new Data();
		t1.ano = 2021;
		
		var t2 = new Data(18,01,2002);
		
		String dataFormatada = t1.obterDataFormatada();
		
		System.out.println(dataFormatada);
		System.out.println(t2.obterDataFormatada());
		
//		t1.imprimirDataFormatda();
//		t2.imprimirDataFormatda();
//		
//		Data t3 = new Data();
//		t3.imprimirDataFormatda();
		
		
	}
}