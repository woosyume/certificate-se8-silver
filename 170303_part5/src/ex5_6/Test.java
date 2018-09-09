package ex5_6;

import java.util.Arrays;
import java.util.List;

class Test {
	public static void main(String[] args) {
		List<String> or = Arrays.asList
						("Pen-100-Tokyo",
						"Note-150-Tokyo",
						"Pen-100-Osaka");
		or.stream().filter(s -> s.contains("Tokyo"))
			.sorted().forEach(System.out::println);
	}
}
