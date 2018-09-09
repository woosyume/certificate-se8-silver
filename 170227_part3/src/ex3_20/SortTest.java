package ex3_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Test implements Comparator<Integer>{
	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		System.out.println(i2.compareTo(i1));
		return i2.compareTo(i1);
	}
	
}

class SortTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(2);
		Collections.sort(list, null);
		System.out.print(
				Collections.binarySearch(list, 3) + " "
				);
		Collections.sort(list, new Test()); //  이 시점에서 역순으로 바뀌네.
		System.out.print(Collections.binarySearch(list, 3));
		System.out.println(list);
	}
}
