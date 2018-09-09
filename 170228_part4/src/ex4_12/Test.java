package ex4_12;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> nameList = 
				Arrays.asList("Duke", "Java", null);
		System.out.println(nameList);
		nameList.replaceAll(x -> x.toLowerCase());
		
	}
}
