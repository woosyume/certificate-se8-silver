package ex15;

public class Main {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int total = 0;
		for (int i : array) {
			if(i%2 == 0) continue;
			total += i;
		}
		System.out.println(total);
	}
}
