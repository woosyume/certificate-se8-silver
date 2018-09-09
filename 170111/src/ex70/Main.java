package ex70;

public class Main {
	public static void main(String[] args) {
		sample(2,3);
	}
	public static void sample(int a, int b) {
		System.out.println(a + b);
	}
	public static void sample(int...num) {
		for(int i : num) {
			System.out.println(i);
		}
	}
}
