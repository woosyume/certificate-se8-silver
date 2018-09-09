package ex02;

public class Sample {
	public static void main(String[] args) {
		String a = "A";
		String b = null;
		//b = a.equals("A")? "test" : a.equals("B")? "sample" : "none";
		a.equals("A")? b = "test" : a.equals("B")? b = "sample" : b = "none";
	}
}
