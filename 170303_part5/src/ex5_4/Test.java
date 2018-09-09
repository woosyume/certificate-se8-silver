package ex5_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Test {
	public static void main(String[] args) {
		List<String> guestList = Arrays.asList("A", "BB", "CCC", "DDDD");
		//long l = guestList.stream().filter(s -> s.length() > 2).count();
		
		long c = guestList.stream().filter(a -> a.length() > 2).mapToInt(a -> ).count();
		System.out.println(c);
		
		//System.out.println();
	}
}
