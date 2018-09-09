package ex26;
import java.time.LocalDate;

public class Sample {
	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2016, 0, 23);
		LocalDate b = LocalDate.parse("2016-11-23");
		System.out.println(a);
	}
}
