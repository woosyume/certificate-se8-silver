package ex1_16;

interface Test {}
class Parent implements Test {}
class Child extends Parent{}
class Duke {}
public class Main {
	public static void main(String[] args) {
		Test t = new Child();
		Child c = new Child();
		Duke d = new Duke();
		
		if(t instanceof Parent) {
			System.out.println("AAA");
		}
		
		if(c instanceof Test) {
			System.out.println("BBB");
		}

		if(d instanceof Child) {
			
		}
	}
}
