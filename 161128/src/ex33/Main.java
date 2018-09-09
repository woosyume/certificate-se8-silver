package ex33;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add(0,"B");
		list.add(0,"C");
		list.add("D");
		
		for(String str : list) {
			System.out.print(str);
		}
	}
}
