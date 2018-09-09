package ex3_9;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<>();
		link.add("AA");
		link.add("DD");
		link.add("BB");
		link.add("AA");
		link.add(null);
/*		Collections.sort(link);
		link.push("CC");
		Collections.reverse(link);*/
		for(String str : link) {
			System.out.println(str + " ");
		}
		
	}
}
