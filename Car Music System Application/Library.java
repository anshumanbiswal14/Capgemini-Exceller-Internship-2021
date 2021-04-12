package day7p1;

public class Library {
	
	Book javaBook;

	public Library(Book javaBook) {
		super();
		this.javaBook = javaBook;
	}
	public Library() {
		super();
	}


	public Book getJavaBook() {
		return javaBook;
	}

	public void setJavaBook(Book javaBook) {
		this.javaBook = javaBook;
	}


	public void doReading(String topic)
	{
		javaBook.readTheBook(topic);
	}

}