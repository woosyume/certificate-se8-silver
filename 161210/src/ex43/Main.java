package ex43;

public class Main {
	public static void main(String[] args) {
		String str = "10";
		String str2 = "TRUE";
		Integer a = Integer.parseInt(str);
		Boolean b = Boolean.parseBoolean(str2);
		Integer c = Integer.valueOf(str);
		Boolean d = Boolean.valueOf(str2);
		System.out.println(a + ", " + b);
		System.out.println(c + ", " + d);
		
	}
}
