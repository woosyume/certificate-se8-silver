package ex47;

public class Main {
	public static void main(String[] args) {
		int[][] array = new int[2][4];
		array[0] = new int[]{1,2,3,4};
		array[1] = new int[]{1,2};
		
		for(int[]a : array) {
			for(int b : a) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
