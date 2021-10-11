package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.GolzinQuadrado;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new GolzinQuadrado(185);
		System.out.println("Golzin Quadrado");
		System.out.println(c1);
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println("Acelorou 6x. " + c1);
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println(c1);
		System.out.println("Velocidade maxima: " + c1.VELOCIDADE_MAXIMA +"KM/h");
		System.out.println("");
		
		Ferrari c2 = new Ferrari();
		System.out.println("Ferrari");
		System.out.println(c2);
		c2.ligarTurbo();
		c2.ligarAr();
		c2.desligarAr();
		
		System.out.println(c2.velocidadeDoAr());
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		System.out.println("Ligou o turbo e acelerou 3x.\n" + c2);
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		System.out.println("Friou 4x.");
		System.out.println(c2);
		System.out.println("Velocidade maxima: " + c2.VELOCIDADE_MAXIMA + "KM/h");
		
		
		
	}

}
