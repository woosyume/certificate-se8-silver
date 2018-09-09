package ex1_21;

public class Check {
	public static void main(String[] args) {
		String str1 = "Duke";
		String str2 = new String("Duke");
		StringBuffer str3 = new StringBuffer("Duke");
		StringBuffer str4 = new StringBuffer("Duke");
		
		if(str1 == str2) System.out.println("A"); // X
		if(str1.equals(str2)) System.out.println("B"); // O
		if(str2.equals(str3))System.out.println("C"); // O
		if(str3 == str4) System.out.println("D"); // X
		if(str3.equals(str4)) System.out.println("E"); // O
		
		StringBuilder sb1 = new StringBuilder("aa");
		StringBuilder sb2 = new StringBuilder("bb");
		System.out.println(sb1.equals(sb2));
	}
}
