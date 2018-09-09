package ex9_38;

public class Main {
	static double total;
	int a = 2, b = 3;
	public static void main(String[] args) {
		double x, a, b; // 위의 int a, b와 중복이 아닌 이유는 non-static이기 때문이다.
		if(total == 0) {
			a = 3;
			b = 4;
			x = 0.5;
		}
		total = x * a * b; // x, a, b가 0으로 초기화되지 않은 상태이기 때문에 else의 가능성을 완전히 배제할 수가 없기에 NG
	}
}
