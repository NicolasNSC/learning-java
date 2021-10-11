package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informa��es de funcionario
		
		//Tipo num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 452;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //L = literal long
		
		//Tipos num�ricos reais
		float salario = 11_445.44F; //f = literal float
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //True
		
		//Tipo caractere
		char status = 'N';
		
		//Dias da empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de viagens
		System.out.println(numerosDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
