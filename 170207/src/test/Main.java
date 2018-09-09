package test;

import java.time.LocalDateTime;

public class Main {
	public void sample() {
		System.out.println("main sample");
	}
	
	public static void main(String[] args) {
/*		String str = null;
		str = "Hello" + (1 + 2);
		System.out.println(str);
*/		
		TestInterface e1 = new Extends1();
		e1.one(); // one은 Extends에서 구현되어 있음.
		e1.three();
		
/*		LocalDateTime time = LocalDateTime.of(2015, 5, 10, 11);
		System.out.println(time);*/
		
		StringBuilder sb = new StringBuilder("Hi");
		String str1 = sb.toString();
		if(sb.toString() == str1) {
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
	}
}
