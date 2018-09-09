package test;

public interface TestInterface {
	final int NUM = 1;
	void one();
	static void two() {
		System.out.println("interface two");
	}
	default void three() {
		System.out.println("interface three");
	}
	int four();
	
}
