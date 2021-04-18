package capglab4exe2;

public abstract class Item{
	
	private int number;
	private String title;
	private int numberOfCopies;
	
	public Item() {
		super();
	}
	
	public Item(int number, String title, int numberOfCopies) {
		super();
		this.number = number;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	public int checkIn(int numberOfCopies) {
		return this.numberOfCopies += numberOfCopies;
	}
	public int checkOut(int numberOfCopies) {
		return this.numberOfCopies -= numberOfCopies;
	}
	
	public void print()
	{
		System.out.println("The BookNumber: "+number);
		System.out.println("The Book Title: "+title);
		System.out.println("The Book Number of Copies: "+numberOfCopies);
	}
	public void AddItems(){
		System.out.println("Items are added");
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean isSame = false;
		// code to compare e1 and e2
		
		if(obj instanceof Item)
		{
		  Item i = (Item)obj;	
		  
		  boolean a = this.number == i.number;
		  boolean b = (this.numberOfCopies == i.numberOfCopies);
		  boolean c = this.title.equals(i.title);
		  
		  return a&&b&&c;
			
		}
		return isSame;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id: "+number+" - "+"Title: "+title+"Number of Copies"+numberOfCopies;
	}
	
}