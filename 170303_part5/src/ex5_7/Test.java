package ex5_7;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

class Test {
	public static void main(String[] args) {
		UnaryOperator<Double> uo = s -> s / 50;
		List<Double> list = Arrays.asList(250.0, 500.0);
		list.stream().filter(s -> s > 300.0)
			.map(s -> uo.apply(s));
	}
}
