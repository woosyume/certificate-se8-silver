package ex18;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcde");
		sb.delete(1, 3);
		sb.deleteCharAt(2);
		System.out.println(sb);
	}
}
