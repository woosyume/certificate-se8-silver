package ex27;

public class Main {
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch(Exception e){
			System.out.println("break!");
		} catch(RuntimeException e) {
			
		}
	}
}
