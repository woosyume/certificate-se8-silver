package ex3_10;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Double> set = new HashSet<>();
		Double d1 = 3.14;
		Double d2 = 1.15;
		Double d3 = 2.34;
		set.add(d1);
		set.add(d2);
		set.add(d3);
		set.add(d2);
		System.out.println(set.size());
		set.remove(d1);
		System.out.println(set.size());
		d2 = 3.45;
		set.remove(d2);
		System.out.println(set.size());
	}
}
