package ex25;
import java.util.function.Predicate;
public class Sample {
	public static void main(String[] args) {
		Predicate<String> p = (str) -> "".equals(str);
		System.out.println(p.test(" "));
	}

}
