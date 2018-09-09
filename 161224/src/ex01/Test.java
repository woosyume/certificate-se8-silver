package ex01;

public class Test {
	public int num;
	public Test(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public void modify(int x) {
		System.out.println("들어온 값 x : " + x);
		System.out.println("변하기 전 num : " + num);
		num += x;
	}
}
