package ex36;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2015, 8, 29);
		LocalDate date3 = LocalDate.parse("2015-08-29 11:29", DateTimeFormatter.);
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}
}
