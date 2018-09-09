package ex5;

public class Main {
	public static void main(String[] args) {
		AbstractSample s = new ConcreteSample();
		s.sample();
		ConcreteSample c = new ConcreteSample();
		c.sample(); // can use methods in the superclass.
	}
}
