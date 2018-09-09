package ex1_11;

public class Sub extends Super{
	int a = 2;
	String method() {
		super.method2();
		return "sub1";
	}
	
	protected String method2() {
		System.out.println("not come?");
		return "sub2";
	}
	
	public void func() {
		Super s = new Sub();
		System.out.println(s.method() + s.method2() + s.a);
	}
	
	public static void main(String[] args) {
		new Sub().func();
		// sub1sub22
	}
}