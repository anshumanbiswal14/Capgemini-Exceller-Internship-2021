package capglab4exe2;

import java.util.Scanner;
public class MainLibrary {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		MainLibrary ml = new MainLibrary();
			
		while(true) {
			System.out.println("Enter the option:\n1.Book Details\n2.Journal Paper Detais\n3.Video Details\n4.CD Details");
			int option = sc.nextInt();
			
			switch(option) {
			  case 1: ml.booksMethod(new Book());
			        break;
			  case 2:ml.booksMethod(new JournalPaper());
			        break;
			  case 3:ml.mediaMethod(new Video());
			        break;
			  case 4:ml.mediaMethod(new CD());
			        break;
			        
			  
			}
				
		}
	}
	public void booksMethod(WrittenItem i) {
		System.out.println("_________________________________________________");
		System.out.println("The Book Number is");
		i.setNumber(sc.nextInt());
		System.out.println("The Book title is");
		i.setTitle(sc.next());
		System.out.println("The Book Number of copy");
        i.setNumberOfCopies(sc.nextInt());
        System.out.println("The Author is");
        i.setAuthorName(sc.next());
        if(i instanceof Book) {
        	i.print();
        }
		if(i instanceof JournalPaper) {
			System.out.println("_________________________________________________");
			System.out.println("The published year");
			((JournalPaper) i).setPublishedYear(sc.nextInt());
			i.print();
		}
	}
	public void mediaMethod(MediaItems mi) {
		System.out.println("_________________________________________________");
		System.out.println("Enter the runtime");
		mi.setRuntime(sc.nextInt());
		if(mi instanceof Video) {
			System.out.println("The director is");
			((Video) mi).setDirector(sc.next());
			System.out.println("The genre is");
			((Video) mi).setGenre(sc.next());
			System.out.println("The year of release");
			((Video) mi).setYear(sc.nextInt());
			((Video) mi).print();
		}
		if(mi instanceof CD) {
			System.out.println("_________________________________________________");
			System.out.println("Artist Name");
			((CD) mi).setArtistName(sc.next());
			System.out.println("the genre is");
			((CD) mi).setGenre(sc.next());
			((CD) mi).print();
		}
	}

}