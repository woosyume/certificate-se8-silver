package ex43;

public class Sample {
	public static void main(String[] args) {
		Integer a = new Integer("1");
		switch (a) {
		case 1:
			System.out.println("A");
			break;

		default:
			System.out.println("B");
		}
	}
}
