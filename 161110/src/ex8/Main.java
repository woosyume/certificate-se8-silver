package ex8;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		/*if(b instanceof A) {
			System.out.println("kya");
		}else {
			System.out.println("kya2");
		}*/
		System.out.println(a.val);
		System.out.println(b.val);
		a.print();
		b.print();// 이것도 오버라이드라 봐야되나...
		
		//B c = new C(); //타입의 형태를 따라가네.
		//System.out.println(c.val);
	}
}
