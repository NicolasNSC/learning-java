package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> reverse = r -> new StringBuilder(r).reverse().toString();
		Function<String, Integer> inteiro = i -> Integer.parseInt(i, 2);
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(reverse)
		.map(inteiro)
		.forEach(System.out::println);
		
	}
}
