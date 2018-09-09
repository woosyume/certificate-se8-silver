package ex17;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("a");
		sb.insert(1, "b");
		sb.append("cde");
		sb.delete(1, 2);
		System.out.println(sb);
	}
}
