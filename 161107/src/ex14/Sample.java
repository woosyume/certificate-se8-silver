package ex14;

public class Sample {
	int a = 0;
	
	Sample() {
		System.out.println(a + 1);
	}
	
	Sample(int a) {
		System.out.println("ddd");
	}
	{
		a = 1;
	}
}
