package ex39;

public class Sample {
	public static void main(String[] args) {
		Item[] items = {
				new Item("apple", 100),
				new Item("banana", 100),
				new Item("orange", 80),
				new Item("mango", 80)
		};
		System.out.println(items);
		System.out.println(items[2]);
		System.out.println(items[2].price);
	}
}
