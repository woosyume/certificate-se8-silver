package ex60;

public class Main {
	public static void main(String[] args) {
		A a = new C();
		C b = new C();
		D c = new D();
/*		if(a instanceof C) System.out.println("a");
		if(b instanceof A) System.out.println("b");
		if(c instanceof A) System.out.println("c");
*/		
		b.doPrint();
	}
}
