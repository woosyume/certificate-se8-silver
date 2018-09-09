package ex74;

public class Main {
	public static void main(String[] args) {
		Object obj = null;
		System.out.println(obj);
	}
	
	private int sample(double val) {
		System.out.println("A");
		return 0;
	}
	
	private String sample(float val) {
		return null;
	}
}
