package day7p1;

public class MainClass {
	public static void main(String[] args) {
		
		
		Book coreJava = new Book();
		coreJava.setBookName(" Core Java Adv Book");
		
		
		Library lib1 = new Library(coreJava);
		lib1.doReading("OOPS");
		
		
		Book book = lib1.getJavaBook();	  // coreJava
		String bookName = book.getBookName();
		bookName = bookName.toUpperCase();
		book.setBookName(bookName);
		lib1.doReading("Exception Handling ");
		
		
		//----------- New Book -----
		Book jdbcJava = new Book();
		lib1.setJavaBook(jdbcJava);
		lib1.doReading("Oracle-JDBC");
		
		
	}

}