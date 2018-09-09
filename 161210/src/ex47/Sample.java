package ex47;

public class Sample {
	int a;
	public Sample(int a) {
		this.a = a;
	}
}

class SubSample extends Sample {
	int b;
	public SubSample(int a, int b) {
		super(a);
		this.b = b;
		
	}
}
