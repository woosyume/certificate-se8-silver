package ex1_15;

interface Exam	{
	public abstract void test();
}

class Bronze {
	public static void pass() {
		System.out.println("B_Pass");
	}
	public void test() {
		System.out.println("B_Test");
	}
}

class Silver extends Bronze {
	public static void pass() {
		System.out.println("S_Pass");
	}
}

class Gold extends Silver implements Exam {
	public static void pass() {
		System.out.println("G_Pass");
	}
	public void test() {
		System.out.println("G_Test");
	}
}

class Rank {
	public static void main(String[] args) {
		Exam e = new Gold();
		Bronze b1 = new Silver(); 
		Bronze b2 = (Bronze)e;
		b1.test(); // B_Test
		b2.test(); // G_Test
		b1.pass(); // B_Pass
		b2.pass(); // B_Pass
	}
}
