package ex1;

public class Main {
	public static void main(String[] args) {
		try {
			int[] array = {};
			array[0] = 10;
			System.out.println(array[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("error");
		}
	}
}
