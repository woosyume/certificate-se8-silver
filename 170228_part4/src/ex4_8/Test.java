package ex4_8;

import java.util.function.BiFunction;

public class Test {
	public static void main(String[] args) {
		BiFunction<Double, Integer, Double> val =
				(t1, t2) -> t1 + t2;
				System.out.println(val.apply((double) 10, 10));
	}
}
