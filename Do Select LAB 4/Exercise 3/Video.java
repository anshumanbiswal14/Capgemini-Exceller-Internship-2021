package capglab4exe2;

import com.cg.eis.bean.Employee;

public class Video extends MediaItems{
	
	
	private String director;
	private String genre;
	private int year;
	
	public Video() {
		super();
	}
	
	public Video(int runtime,String director, String genre, int year) {
		
		super(runtime);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("The director: "+director);
		System.out.println("The genre: "+genre);
		System.out.println("The Year of release: "+year);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean isSame = false;
		// code to compare e1 and e2
		
		if(obj instanceof Employee)
		{
		  Video e = (Video)obj;	
		  
		  boolean a = this.director.equals(e.director);
		  boolean b = this.year == e.year;
		  boolean c = this.genre.equals(e.genre);
		  
		  return super.equals(obj) && a && b && c;
			
		}
		return isSame;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Director: "+director+"Genre: "+genre+"Year: "+year;
	}
	
    
}