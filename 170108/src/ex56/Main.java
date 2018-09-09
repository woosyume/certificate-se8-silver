package ex56;

public class Main {
	private String val;
	private int num;
	public Main(int num) {
		this.num = num;
	}
	public Main() {
		System.out.println("yeah");
		this.val = "test";
		this.num = 10;
	}
	public static void main(String[] args) {
		Main m = new Main(20);
		System.out.println(m.val + ", " + m.num);
	}
}
