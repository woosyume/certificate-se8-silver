package ex1_19;
class Foo{}
public class Fruit {
	public static void main(String[] args) {
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		Foo f3 = f2;
		
		System.out.println(f1.equals(f2)); // false
		System.out.println(f2.equals(f3)); // true
		System.out.println(f1 == f2); // false
		System.out.println(f2 == f3); // true
		
	}
}
