package ex1;

public class Main {
	public static void main(String[] args) {
		try {
			int[] array = {};
			array[0] = 1;
			System.out.println("finish");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("error");
		}
	}
}
