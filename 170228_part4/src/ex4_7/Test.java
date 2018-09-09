package ex4_7;

import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {
		Predicate<String> p = str -> str.equals("Hello");
	}
}
