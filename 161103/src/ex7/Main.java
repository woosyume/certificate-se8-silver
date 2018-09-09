package ex7;

public class Main {
	public static void main(String[] args) {
		Sample.num = 10;
		Sample s = new Sample();
		Sample s2 = new Sample();
		s.num += 10;
		s2.num = 30;
		System.out.println(Sample.num);
		System.out.println(s.num);
		System.out.println(s2.num);
		
		System.out.println(s);
		System.out.println(s2);
		
	}
}
