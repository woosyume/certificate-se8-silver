package ex3_21;

import java.util.Comparator;
import java.util.TreeSet;

class Test implements Comparator<String> {
	{
		System.out.println("test");
	}
	@Override
	public int compare(String s1, String s2) {
		System.out.print("s1 : " + s1 + ", s2 : " + s2 + " // So..value is ");
		System.out.println(s1.length() - s2.length());
		return 0;
	}
}

class CompTest {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(new Test());
		ts.add("abcde");
		System.out.println("first ts " + ts);
		ts.add("xyz");
		System.out.println("second ts " + ts);
		ts.add("ab");
		System.out.println("third ts " + ts);
		for(String s : ts) {
			System.out.println(s);
		}
	}
}
