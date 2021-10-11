package classe;

public class AreaCirc {

	double raio;
	static final double PI = 3.1415;
	
	AreaCirc(double _raio) {
		raio = _raio;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
		
	}
}
