package ex4_13;

import java.util.function.ToIntFunction;

public class Test {
	public static void main(String[] args) {
		String str = "I am a Java developer";
		//ToIntFunction<String> index = str::indexOf;
		ToIntFunction<String> index = (String value) -> str.indexOf(value);
		int x = index.applyAsInt("Ja");
		System.out.println(x);
	}
}
