package ex23;

public class Main {
	public static void main(String[] args) {
		int num = 0;
		String[] array = {"A", "B", "C", "D"};
		for(String s : array) {
			switch(s) {
				case "D":
					System.out.println("D");
				case "A":
					num -= 1;
					System.out.println(num);
					break;
				case "B":
					Syswtem.out.println("B");
					num++;
				case "C":
					System.out.println("C");
					num += 2;
			}
		}
	}
}
