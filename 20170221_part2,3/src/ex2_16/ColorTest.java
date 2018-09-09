package ex2_16;
enum Color {
	Red("Aka"), Blue("Ao"), Black("Kuro");
	private String c;
	Color(String c) {
		this.c = c;
	}
}
public class ColorTest {
	public static void main(String[] args) {
		for(Color color : Color.values()) {
			System.out.println(color.toString());
		}
	}
}
