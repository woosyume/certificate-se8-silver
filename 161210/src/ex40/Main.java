package ex40;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		
		if(list.remove("b")) {
			list.remove("d");
		}
		System.out.println(list);
	}
}
