package test;

public interface TestInterface2 extends TestInterface{
	public default void three() {
		System.out.println("interface2 three");
	}
}
