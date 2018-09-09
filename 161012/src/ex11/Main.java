package ex11;

public class Main {
	public static void main(String[] args) {
		char[] arrayA = {'a', 'b', 'c', 'd', 'e'};
		char[] arrayB = new char[arrayA.length];
		System.arraycopy(arrayA, 1, arrayB, 0, 4);
		for(char c : arrayB) {
			System.out.print(c);
		}
	}
}
