package ex59;

public class Main {
	private static int num;
	static {
		num = 10;
	}
	static {
		num = 20;
	}
	static void test(int num) {
		System.out.println("yeah");
		num = num * num;
	}
	public static void main(String[] args) {
		test(num);
		System.out.println(num);
	}
}
