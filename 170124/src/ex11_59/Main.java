package ex11_59;

public class Main {
	private static int num;
	static {
		num = 10; // ...1
	}
	static {
		num = 20; // ...2 static initializer는 위에서부터 차례차례 실행
				  // instance처럼 생성자를 이용해서 field를 바꾸거나 할 수 없다.
	};
	static void test(int num) {
		num = num * num; // 여기서는 복제된 값에 대한 변화만 있는 것일 뿐이며(local), 무엇보다 static area의 field는 이처럼
		                 // instance 값 변경 방식으로 바꿀 수 없다.
	}
	
	public static void main(String[] args) {
		test(num);
		System.out.println(num);
	}
}
