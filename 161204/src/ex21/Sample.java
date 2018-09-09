package ex21;

public class Sample {
	int a;
	static int b;
	public Sample(int ns) {
		if(b < ns) {
			b = ns;
			this.a = ns;
		}
	}
	
	void doPrint() {
		System.out.println("a= " + a + ", b= " + b);
	}
}
