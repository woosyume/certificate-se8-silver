package other;

public class Book {
	private String isnb;
	
	public void setIsbn(String isbn) {
		this.isnb = isbn;
	}
	
	public void printInfo() {
		System.out.println(isnb);
	}
}
