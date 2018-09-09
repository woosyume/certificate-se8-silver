package ex20;

public class Test {
	public static void main(String[] args) {
		String[][] array = new String[2][];
		array[0] = new String[2];
		System.out.println("array.length is..." + array.length);
		array[1] = new String[5]; // array in array?
		int i = 97;
		for(int a = 0; a < array.length; a++) {
			for(int b = 0; b < array.length; b++) {
				array[a][b] = "" + i;
				i++;
			}
		}
		System.out.println(array[1][2].length());
		
/*		for(String[] tmp : array) {
			for(String s : tmp) {
				System.out.print(s + " ");
			}
			System.out.println();
		}*/
	}
}
