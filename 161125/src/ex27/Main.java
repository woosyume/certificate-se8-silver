package ex27;
import java.time.*;

public class Main {
	public static void main(String[] args) {
		LocalTime time = LocalTime.of(1,0,2);
		LocalTime time2 = time.plusHours(12);
		System.out.println(time2);
	}
}
