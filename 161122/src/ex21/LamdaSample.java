package ex21;

public class LamdaSample {
	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("hello");
		};
		Thread thread = new Thread(r);
		thread.start();
		System.out.println("finish");
	}
}
