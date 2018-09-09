package ex3;
public class Main {
	public static void main(String[] args) {
		String[] array = {"abcde", "fgh", "ijk"};
		String[] array2 = new String[3];
		int i = 0;
		try {
			for(String str : array) {
				array2[i] = str.substring(1, 4);
				i++;
			}
		} catch(Exception e) {
			System.out.println("Error");
		}
		for(String str : array2) {
			System.out.println(str);
		}
	}
}
	