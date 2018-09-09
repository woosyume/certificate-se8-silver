package ex16;

public class Sample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String str = "";
//		boolean a;
//		a = sb == null;
//		System.out.println(a);
		
		if(sb.equals(str)) {
			System.out.println("A");
		}else if (sb.toString().equals(str.toString())){
			System.out.println("B");
		}else {
			System.out.println("C");
		}
	}
	
	public int calc(int a) {
		return 0;
	}
}
