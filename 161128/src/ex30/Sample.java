package ex30;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sample {
	public static void main(String[] args) {
		LocalDateTime time = LocalDateTime.of(2015, 8, 31, 0, 0);
		String str = time.format(DateTimeFormatter.ISO_INSTANT);
		
		System.out.println(str);
	}
}
