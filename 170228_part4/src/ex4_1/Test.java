package ex4_1;

@FunctionalInterface
interface Test {
	public String toString();
	public void func();
	public default void test(){}
	public static void test1(){}
	
}
