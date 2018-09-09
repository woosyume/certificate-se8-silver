package ex2;

public class Main {
	public static void main(String[] args) {
		String str = "hoge, world";
		hello(str);
		System.out.println(str);
	}

	private static void hello(String str) {
		System.out.println(str);
		String msg = str.replaceAll("hoge", "hello");
		System.out.println(msg + " : 나야 나");
	}
}
