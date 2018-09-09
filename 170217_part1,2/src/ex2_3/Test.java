package ex2_3;
abstract class Hoge{
	abstract void bar();
	void foo() {
		System.out.println("foo ");
	}
}
public class Test extends Hoge{
	public void foo() {
		System.out.println("foo2 ");
	}
	void bar() {
		System.out.println("bar ");
	}
	public static void main(String[] args) {
		Hoge h1 = new Test();
		Hoge h2 = new Hoge();
	}
}
