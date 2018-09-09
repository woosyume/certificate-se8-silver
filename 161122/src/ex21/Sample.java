package ex21;

public class Sample {
	public static void main(String[] args) {
		Thread thread = new Thread(new Function());
		thread.start();
		System.out.println("finish");
	}
}
