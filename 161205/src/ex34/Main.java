package ex34;

public class Main {
	String val = "7";
	public void doStuff(String str) {
		int num = 0;
		try {
			String val = str;
			num = Integer.parseInt(val);
			
			System.out.println("val1 = " + val + ", num = " + num);

		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("error");
		}
		System.out.println("val = " + val + ", num = " + num);
	}
	
	public static void main(String[] args) {
		new Main().doStuff("9");
	}
}