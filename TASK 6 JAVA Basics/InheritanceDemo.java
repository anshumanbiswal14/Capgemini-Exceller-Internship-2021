package day8p1;

public class InheritanceDemo {
	

	public InheritanceDemo() {
		super();
		System.out.println("Class A");
		
	}
	
	
}

class B extends InheritanceDemo{
	B(int x){
		super();
		System.out.println("Class B");
		
		
	}
}

class C extends B{


	public static int x;

	C() {
		super(45);
		System.out.println("Class C");
		
	}

}