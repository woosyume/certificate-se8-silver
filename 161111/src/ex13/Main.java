package ex13;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		/*if(a instanceof A) {
			System.out.println("dd");
		} else {
			System.out.println("Aa");
		}
		
*/		B b = new B();
/*		if (b instanceof B) { // 상속이라 A타입 B타입 둘 다 맞다.
			System.out.println("ddddd");
		}
*/		
		b = a;
		
		//b.hello();
	}
}
