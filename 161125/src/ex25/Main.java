package ex25;
import java.util.*;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		List<Sam> list;
		list = Arrays.asList(
				new Sam(10),
				new Sam(20),
				new Sam(30)
				);
		Predicate<Sam> x = s -> list.contains(s);
		if(x.test(new Sam(20))) {
			System.out.println("ok");
		}
	}
}
class Sam {
	private int num;
	public Sam(int num) {
		this.num = num;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Sam == false) {
			return false;
		}
		
		if(this.num == ((Sam)obj).num) {
			return true;
		}
		return false;
	}
}
