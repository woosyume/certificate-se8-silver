package ex9;

public class Main {
	public static void main(String[] args) {
		Worker a = new Engineer();
		Employee b = new Engineer();
		Engineer c = new Engineer();
		a.create();
		b.work();
		c.report();
	}
}
