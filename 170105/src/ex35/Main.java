package ex35;

public class Main {
	public static void main(String[] args) {
		int[] arrayA = new int[3];
		int[] arrayB = {1,2,3,4,5};
		arrayA = arrayB;
		
		for(int i : arrayA) {
			System.out.println(i);
		}
	}
}
