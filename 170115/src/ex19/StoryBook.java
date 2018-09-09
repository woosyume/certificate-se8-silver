package ex19;
import other.Book;
public class StoryBook extends Book{
	public static void main(String[] args) {
		StoryBook b = new StoryBook();
		b.printInfo();
		
		Book book = new Book();
		book.printInfo();
	}
}
