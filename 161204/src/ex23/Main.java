package ex23;

public class Main {
	public static void main(String[] args) {
		SubSample s1 = new SubSample(100);
		SubSample s2 = new SubSample("sample", 200, 100);
		System.out.println(s1.name + ", " + s1.num + ", " + s1.price);
		System.out.println(s2.name + ", " + s2.num + ", " + s2.price);
	}
	
	
}
