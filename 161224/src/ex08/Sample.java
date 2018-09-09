package ex08;

public class Sample {
	public static final int NUM = 1;
	public static void main(String[] args) {
		int x = args.length;
		System.out.println("x is..." + x);
		if(check(x)) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}
	}
	private static boolean check(int x) {
		return (x >= NUM)? true : false;
	}
}
