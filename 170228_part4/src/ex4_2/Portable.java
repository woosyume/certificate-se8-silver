package ex4_2;

public interface Portable<Integer>{
	public void handCarry(Integer weight);
	public default void delivery(Integer weight) {
		System.out.println("ABC delivery");
	}
}

class Main {
	public static void main(String[] args) {
		Portable<Integer> p = n -> System.out.println("carry " + n + "kg");
		p.handCarry(20);
		p.delivery(100);
	}
}