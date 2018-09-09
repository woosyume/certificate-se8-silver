package ex22;

public class Main {
	public static void main(String[] args) {
		Item a = new Item(1, "pen");
		Item b = new Item(1, "pen");
		Item c = a;
		
		boolean ans1 = a==b;
		boolean ans2 = a.name.equals(b.name);
		System.out.println(ans1 + " : " + ans2);
	}
}
