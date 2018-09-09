package ex21;

public class Main {
	public static void main(String[] args) {
		Algorithm algorithm = (String name) -> {
			System.out.println("hello, " + name);
		};
		Service s = new Service();
		s.setLogic(algorithm);
		s.doProcess("Lambda");
	}
}
