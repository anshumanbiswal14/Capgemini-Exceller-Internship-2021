package capglab4exe2;

public abstract class MediaItems extends Item {
	private int runtime;
    
	
	public MediaItems() {
		super();
	}


	public MediaItems( int runtime) {
		super();
		this.runtime = runtime;
	}


	public int getRuntime() {
		return runtime;
	}


	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("The runtime is: "+runtime);
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean issame = false;
		if(obj instanceof MediaItems) {
			MediaItems mi = (MediaItems)obj;
			boolean a = this.runtime == mi.runtime;
		 return a;
		}
		return issame;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Runtime: "+runtime;
	}
	
	

}