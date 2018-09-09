package ex15;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append(true);
		sb.append(10);
		sb.append('a');
		sb.append("bcdef",1,3);
		
		char[] array = {'h','e','l','l','o'};
		sb.append(array);
		System.out.println(sb.toString());
	
	}
}
