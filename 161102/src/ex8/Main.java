package ex8;

public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++, period()) {
			System.out.print(i);
		}
	}

	private static void period() {
		System.out.print(", ");
	}
}
