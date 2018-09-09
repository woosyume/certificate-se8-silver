package ex36;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		for(String str : list) {
			if("B".equals(str)) {
				list.remove(str);
			}else {
				System.out.println(str);
			}
		}
	}
}
