package ex5_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Test {
	public static void main(String[] args) {
		List<Book> list = Arrays.asList(new Book("Platinum:"),
				new Book("Gold:"),
				new Book("Silver:"));
		
		Stream<Book> str = list.stream();
		str.map(b -> b.title).forEach(System.out::print);
	}
}

class Book {
	String title;
	Book(String title) {
		this.title = title;
	}
}
