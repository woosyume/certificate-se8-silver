package ex59;

public class Sample {
	public static void main(String[] args) {
		try {
			test();
		} catch(MyException e) {
			System.out.println("A");
		}
	}
	
	public static void test() {
		try {
			double random = Math.random();
			System.out.println("double random is..." + random);
			throw Math.random() > 0.5? new MyException() : new RuntimeException();
		} catch(RuntimeException e) {
			System.out.println("B");
		}
	}
}

class MyException extends RuntimeException {
	
}
