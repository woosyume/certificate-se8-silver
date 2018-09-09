package ex31;

public class Sample {
	void test() throws Exception {
		System.out.println("test");
	}
	
	void hoge() throws RuntimeException {
		System.out.println("hoge");
	}
	public static void main(String[] args) throws Exception {
		Sample s = new Sample();
		s.test();
		s.hoge();
	}
}
