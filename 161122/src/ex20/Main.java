package ex20;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.insert(0, "abcde");
		CharSequence seq = sb.subSequence(1, 5);
		String str = new StringBuilder(seq).substring(1,3);
		System.out.println(str);
	}
}
