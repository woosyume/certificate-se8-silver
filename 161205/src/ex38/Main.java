package ex38;

public class Main {
	static double total;
	int a = 2, b = 3;
	public static void main(String[] args) {
		double x, a, b;
		if(total == 0) {
			a = 3;
			b = 4;
			x = 0.5;
		}
		
		total = x * a * b;
		System.out.println(total);
	}
}
