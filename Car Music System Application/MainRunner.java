package day7p1;

public class MainRunner {

	public static void main(String[] args) {
		
		Engine hondaEngine = new Engine(1000); // type of A
		Engine tataEngine = new Engine(1200);  // type of B
		
		
		// --- default features-----
		//  ---- Base model ---
		Car car1 = new Car(hondaEngine);
		car1.moveCarForward();
		
		// ---- new enhancements in old component ---
		// ---- do some changes in base engine --
		Engine e = car1.getEngine();
		e.setBasepower(e.getBasepower()+1);
		
		car1.moveCarForward();
		
		//--- Switch to new component ---
		// --- change engine ---
		car1.setEngine(tataEngine);
		car1.moveCarForward();
		
		
		MusicSystem m1 = new MusicSystem();
		car1.setMs(m1);
		car1.playMusic();
		
	

	
	}
}