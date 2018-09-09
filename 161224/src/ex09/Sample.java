package ex09;

public class Sample {
	public static void main(String[] args) {
		String a = "A";
		a = a.concat("B");
		String b = "C";
		a = a.concat(b);
		a.replace('C', 'D');
		System.out.println(a);
	}
}
