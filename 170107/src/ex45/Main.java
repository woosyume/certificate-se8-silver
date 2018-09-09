package ex45;

public class Main {
	public static void main(String[] args) {
		String str = "a b 3 d e";
		String[] array = str.split("\\d");
		System.out.println(array);
	}
}
