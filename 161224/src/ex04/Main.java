package ex04;

public class Main extends Sample {
	@Override
	public void process() {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		Sample s = new Main();
		Sample s2 = new Sample();
		test(s);
		test(s2);
	}

	private static void test(Function f) {
		f.process();
	}
}
