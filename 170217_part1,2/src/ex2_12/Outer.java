package ex2_12;

public class Outer {
	String msg;
	static class Inner {
		int counter = 0;
		void increment() {
			counter++;
		}
	}
	public static void main(String[] args) {
		new Outer.Inner();
	}
}
