package ex72;

public class Main {
	public static void main(String[] args) {
		int a = 10;
/*		if(a++ > 10)
		if(a < 100) a--;
		else a--;
		else a++;
*/
		if(a++ > 10) {
			System.out.println(a);

			if(a < 100) {
				System.out.println(a);

				a--;
			}else {
				System.out.println(a);

				a--;
			}
		}else {
			System.out.println(a +"ww");

			a++;
		}
		System.out.println(a);
	}
}
