package ex11_69;

public class Main {
	public static void main(String[] args) {
		char[] array = "HelloWorld".toCharArray();
		char[] array2 = new char[array.length];
		System.arraycopy(array, 1, array2, 1, array.length);
		System.out.println(array2); 
		// 1에서 시작한만큼 결국 하나 빠져나가기 때문에 ArrayIndexOutOfBoundsException이 된다.
	}
	
	public int sample() {
		return 0;
	}
	public String sample() {
		return null;
	}
}
