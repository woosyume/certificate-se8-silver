package ex37;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		for(String str : list) {
			if("C".equals(str)) {
				list.remove(str);
			}
		}
		
		for(String str : list) {
			System.out.print(str);
		}
	}
}
