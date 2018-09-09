package ex14;

public class Main {
	public static void main(String[] args) {
		String[] array = {"A", "B"};
		for(String a : array) {
//			System.out.println(a + " : 상위루프");
			for(String b : array) {
				if("B".equals(b)) break;
				System.out.print(a);
			}
		}
	}
}
