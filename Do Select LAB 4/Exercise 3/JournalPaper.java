package capglab4exe2;

public class JournalPaper extends WrittenItem{
	private int publishedYear;

	public JournalPaper() {
		super();
	}

	public JournalPaper(int number, String title, int numberOfCopies, String authorName, int publishedYear) {
		super(number, title, numberOfCopies, authorName);
		this.publishedYear = publishedYear;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean isSame = false;
		if(obj instanceof JournalPaper) {
			JournalPaper j = (JournalPaper)obj;
			boolean a = this.publishedYear == j.publishedYear;
			return super.equals(obj) && a;
		}
		return isSame;
	}
    
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("The book Published year: "+publishedYear);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Publihed Year: "+publishedYear;
	}
}