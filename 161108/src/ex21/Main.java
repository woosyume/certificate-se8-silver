package ex21;

public class Main {
	public static void main(String[] args) {
		Sample s = new Sample(10);
		modify(s.num);
		System.out.println(s.num);
	}
	
	private static void modify(int num) {
		num *= 2;
	}
}
