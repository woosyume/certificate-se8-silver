package ex22;

public class Main {
	public static void main(String[] args) {
		int point = 80;
		String val = point < 40? "D"
				: point < 60? "C"
				: point < 80? "B"
				: "A";
		System.out.println(val);
	}
}
