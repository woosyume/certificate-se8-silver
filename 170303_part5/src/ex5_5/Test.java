package ex5_5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Test {
	public static void main(String[] args) {
		List<String> strs = Arrays.asList
				("SE8", "Java SE8 Silver", "Java SE8 Gold");
		Predicate<String> f1 = s -> s.length() > 5;
		Predicate<String> f2 = new BookFilter() {
			public boolean test(String s) {
				return s.contains("SE8");
			}
		};
		int count = (int)strs.stream().filter(f1).filter(f2).count();
		System.out.println(count);
	}
}

interface BookFilter extends Predicate<String> {
	public default boolean test(String str) {
		return str.equals("SE8");
	}
}
