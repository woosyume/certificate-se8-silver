package ex4_11;

import java.util.Arrays;
import java.util.Comparator;

class ValueCheck {
	public static int checkDef(String s1, String s2) {
		return s1.length() - s2.length();
	}	
}

class TestValue {
	public static void main(String[] args) {
		String[] strArray = {"Tiget", "Rat", "Cat", "Lion"};
		// Insert code here
//		Arrays.sort(strArray, ValueCheck::checkDef);
	
/*		Arrays.sort(strArray, new Comparator<String>() {
			public int compare(String arg0, String arg1) {
				return 0;
			}
			
		});
*/		
		
		Arrays.sort(strArray, ValueCheck::checkDef);
		for(String s : strArray) {
			System.out.print(s + " ");
		}
	}
}