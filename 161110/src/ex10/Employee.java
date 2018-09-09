package ex10;

public class Employee implements Worker{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("work");
	}
	
	public void report() {
		System.out.println("report");
	}
}
