package ex22;

interface Test2 {
	String process();
}

public class Sample2 {
	public static void main(String[] args) {
		Test2 t = () -> "hello!";
		System.out.println(t.process());
	}
}
