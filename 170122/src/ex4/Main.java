package ex4;

public class Main {
	public static void main(String[] args) {
		System.out.println("A");
	}
	public static void main(int args) {
		System.out.println("B");
	}
	public static void main(int... args) {
		System.out.println("C");
	}
	public static void main(double args) {
		System.out.println("D");
	}
}
