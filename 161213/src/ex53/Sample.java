package ex53;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sample {
	public static void main(String[] args) {
		String date = LocalDate.parse("2015-08-23")
				.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);
	}
}
