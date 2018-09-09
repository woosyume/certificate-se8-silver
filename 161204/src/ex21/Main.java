package ex21;

public class Main {
	
	public static void main(String[] args) {
		Sample s1 = new Sample(10);
		Sample s2 = new Sample(30);
		Sample s3 = new Sample(20);
		
		s2 = new Sample(30);
		s3 = s1;
		s1.doPrint();
		s2.doPrint();
		s3.doPrint();
		
	}
	
}
