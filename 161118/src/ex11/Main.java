package ex11;

public class Main {
	public static void main(String[] args) {
		String regex = "a*";
		String sample = "change";
		if(sample.matches(regex)) {
			System.out.println("success");
		}else {
			System.out.println("fail");
		}
	}
}
