package ex10;

public class Main {
	public static void main(String[] args) {
		String str = "a. b. c. d. e";
		String[] array = str.split("\\w\\s"); // because String class is immutable
		for(String a : array) {
			System.out.print(a);
		}
	}
}
