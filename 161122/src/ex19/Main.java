package ex19;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abcde");
		sb.reverse();
		sb.replace(1, 3, "a");
		System.out.println(sb);
	}
}
