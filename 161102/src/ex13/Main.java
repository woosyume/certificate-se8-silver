package ex13;

public class Main {
	public static void main(String[] args) {
		int num = 10;
/*		do {
			num++;
			System.out.println(num);
		} while (++num < 10);
		System.out.println(num);
*/
		while(++num < 10) num--;
		// 일단 인크리먼트가 이뤄지긴 하는군
		System.out.println(num);
		
	}
}
