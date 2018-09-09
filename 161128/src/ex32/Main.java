package ex32;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("A");
		list.add("A");
		list.add(null);
		list.add('B');
		list.add(2, "A");
		
		for(Object obj : list) {
			System.out.print(obj);
		}
		
	}
}
