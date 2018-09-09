package ex11_26;

public class Main {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = b += a / 5; // value int b has is changed also at this point.
		System.out.println(a+b+c);
	}
}
