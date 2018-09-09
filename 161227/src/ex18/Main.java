package ex18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String[] array = {"apple", "banana", "orange"};
		List<String> list = new ArrayList<>(Arrays.asList(array));
		if(list.removeIf(
				(String s) -> {
					return s.length() == 5;
				}
				)) {
			System.out.println(s);
		}
	}
}
