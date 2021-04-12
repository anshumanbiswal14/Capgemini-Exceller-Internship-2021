package day8p1;

public class Dog extends Animal{

	
	public Dog(int legs, float weight) {
		super(legs, weight);
		
	}
	
	public void doPlayGames() {
		System.out.println("Dog play games called....");
	}
	
	//override the Animal doFeed() Method
	
	public void doFeed(int food) {
		super.weight += (food*0.25);
		System.out.println("Inside dog implements the dofeed method"+super.weight);
		
	}
	
	//override the Animal doFeed() Method
	
	public void doWalk() {
		System.out.println("Implimentation of the dogwalk method"+super.legs);
	}

}
