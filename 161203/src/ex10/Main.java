package ex10;

public class Main {
	public static void main(String[] args) {
		String[] str = new String[2];
		int i = 0;
		for(String s 
				: str) {
			System.out.println(str[0]);
			str[i].concat("e" + i);
			i++;
		}
		for(i =0; i < str.length;) {
			System.out.println(str[i]);
		}
		
	}
}
