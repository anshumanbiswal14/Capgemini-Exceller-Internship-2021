package day8p1;

public class AnimalGameApp {
	
	public static void main(String[] args) {
		AnimalGameApp app = new AnimalGameApp();
		
		// Animal a = new Dog(); // this is called as Down casting
		
		Dog dog = new Dog(4,20F);
		app.doAnimalThings(dog,2);
		
		System.out.println("---------------------------------------------------------");
		
		Cat cat = new Cat(4,8F);
		app.doAnimalThings(cat, 2);
	}

	
	public void doAnimalThings(Animal a,int food) {
		
		a.doWalk();
		a.doFeed(food);

		
		// here we are using the business method (instance of) //
		
		if(a instanceof Dog) {
			
			//call all the dog related things
			
			Dog d = (Dog)a; // this is called as Up casting
			d.doPlayGames();
			
			// here new obj creation will not work due to STATE MANAGEMENT
			
					}
		
		if (a instanceof Cat) {
			
			// call all the cat related things 
			
			Cat c = (Cat)a;
			c.doCatThings();
		}
	}
}
