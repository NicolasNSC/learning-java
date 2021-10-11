package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Maria", false, 17000.88);
		Usuario u2 = new Usuario("Pedro", true, 2000.00);
		Usuario u3 = new Usuario("Josoé", true, 1200.00);
		Usuario u4 = new Usuario("Reginaldo", false, 2300.56);
		Usuario u5 = new Usuario("Marcia", false, 5000.65);
		Usuario u6 = new Usuario("Fredo", false, 9000.99);
		Usuario u7 = new Usuario("Paula", true, 2999.00);
		
		List<Usuario> usuarios = Arrays.asList(u1,u2,u3,u4,u5,u6,u7);
		
		
		Predicate<Usuario> nomeLimpo = nl -> nl.nomeLimpo == false;
		Predicate<Usuario> rendaAlta = ra -> ra.renda >= 3500.00;
		Function<Usuario, String> alerta = a -> "Prezado(a) " + a.nome + ", você está com pendencia de dividas em nosso sistema, e devido ao mesmo, será descontando 15% de sua \nrenda mensal de " + a.renda +  " para quitação da divida até o valor estimado ser atingido.\n";  
		
		usuarios.stream()
		.filter(nomeLimpo)
		.filter(rendaAlta)
		.map(alerta)
		.forEach(System.out::println);
		
		
		
		
	}

}
