package ex26;

public class Main {
	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		int a = x++;
		System.out.println(x);
		int b = ++x;
		System.out.println(x);
		int c = x++;
		System.out.println(x);
		
		//int d = (a < b)? a : (b < c) ? b : c;
	}
}
