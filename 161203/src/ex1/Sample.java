package ex1;

public class Sample {
	int i = 0;
	static int num = 0;
	public void test() {
		while(i < 3) {
			i++;
			num++;
		}
	}
	
	public static void main(String[] args) {
		Sample a = new Sample();
		System.out.println(a.num);
		Sample b = new Sample();
		System.out.println(b.num);
		
		a.test();
		System.out.println(a.num);
		System.out.println(b.num);

		b.test();
		System.out.println(a.num + " : " + b.num);
	}
}
