package ex9;

public class Main {
	public static void main(String[] args) {
		A[] array = {new C(), null, new D()};
		Object[] objArray = array;
		
		A[] sample = new B[]{};
		B[] sample1 = (B[]) new A[]{};
		System.out.println(sample);
	}
}
