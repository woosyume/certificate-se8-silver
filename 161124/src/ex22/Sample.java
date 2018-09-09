package ex22;

interface Test {
	void process(int x);
}

public class Sample {
	public static void main(String[] args) {
		Test t = x -> {
			System.out.println(x);
		};
		t.process(10);
	}
}
