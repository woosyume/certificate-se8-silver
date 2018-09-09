package ex8;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("ab");
		CharSequence a = sb.subSequence(0, 3);
		System.out.println(a);
	}
}
