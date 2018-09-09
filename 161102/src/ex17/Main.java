package ex17;

public class Main {
	public static void main(String[] args) {
		int total = 0;
		a: for (int i = 0; i < 5; i++) {
			b: for (int j = 0; j < 5; j++) {
				if(i % 2 == 0) continue a;
				if(3 < j) break b;
				total += j;
			}
		}
		System.out.println(total);
		
		/*
		 * 0 0
		 * 0 1 1
		 * 0 2 3
		 * 0 3 6
		 * 0 4
		 *   5
		 * 1 0 
		 * 1 1 7
		 * 1 2 9
		 * 1 3 12
		 * 
		*/
	}
}
