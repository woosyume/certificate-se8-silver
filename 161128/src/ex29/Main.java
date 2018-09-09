package ex29;

import java.time.LocalDate;
import java.time.Period;

public class Main {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate target = now.plusDays(10);
		Period x = now.until(target);
		System.out.println(x.getMonths());
		
	}
}
