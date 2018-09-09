package ex69;

public class Main {
	public static void main(String[] args) {
		char[] array = "HelloWorld".toCharArray();
		char[] array2 = new char[array.length];
		System.arraycopy(array, 1, array2, 1, 2);
		System.out.println(array2[0]);
	}
}
