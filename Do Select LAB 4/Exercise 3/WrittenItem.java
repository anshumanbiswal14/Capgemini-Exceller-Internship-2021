package capglab4exe2;

	public abstract class WrittenItem extends Item{
		private String authorName;

		public WrittenItem() {
			super();
		}
		public WrittenItem(int number, String title, int numberOfCopies, String authorName) {
			super(number, title, numberOfCopies);
			this.authorName = authorName;
		}

		public String getAuthorName() {
			return authorName;
		}
		
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		
		
		@Override
		public boolean equals(Object obj) {
			boolean isSame = false;
			
			if(obj instanceof Item)
			{
			  WrittenItem i = (WrittenItem)obj;	
			  boolean a = this.authorName.equals(i.authorName);
			  
			  return super.equals(obj) && a;
				
			}
			return isSame;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString()+"Author Name: "+authorName;
		}
		@Override
		public void print() {
			// TODO Auto-generated method stub
			super.print();
			System.out.println("The Book Author is: "+authorName);
		}
		

	}