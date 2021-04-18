package capglab4exe2;

public class CD extends MediaItems{

	private String artistName;
      private String genre;
	public CD() {
		super();
	}

	public CD(int runtime, String artistName, String genre) {
		super(runtime);
		this.artistName = artistName;
		this.genre = genre;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
    @Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("The artist name: "+artistName);
		System.out.println("The genre: "+genre);
	}

	@Override
	public boolean equals(Object obj) {
		boolean isSame = true;
		if(obj instanceof CD)
		{
		  CD i = (CD)obj;	
		  
		  boolean a = this.artistName.equals(i.artistName);
		  boolean b = this.genre.equals(i.genre);
		  
		  return super.equals(obj) && a && b;
			
		}
		return isSame;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"ArtistName: "+artistName+"Genre"+genre;
	}
	
      
}