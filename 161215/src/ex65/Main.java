package ex65;

public class Main {
	void main() {
		System.out.println("A");
	}
	
	static void main(String args) {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		System.out.println("C");
	}
	
	void main(Object[] args) {
		System.out.println("D");
	}
}
