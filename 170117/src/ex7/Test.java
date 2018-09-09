package ex7;

public class Test {
	public static void main(String[] args) {
		int num = 0;
		num = go(num);
		System.out.println(num);
	}
	
	public static int go(int num) {
		num += 1;
		return num;
	}
}
