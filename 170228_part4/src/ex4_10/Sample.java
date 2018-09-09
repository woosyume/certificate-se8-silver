package ex4_10;

import java.util.function.Function;

public class Sample {
	public static void main(String[] args) {
		Function<String, Integer> a = String::length;
		System.out.print(a.apply("Hello")); // 규칙을 정한 이후에 apply는 그것을 실행하고, 정해진 return 타입의 결과값을 받는구나.
	}
}
