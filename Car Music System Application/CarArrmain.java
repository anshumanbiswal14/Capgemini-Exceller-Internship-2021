package day7p1;
import day7p1.Car;
import day7p1.Engine;

public class CarArrmain {
	public static void main(String[] args) {


Engine e1 = new Engine(800);
Engine e2 = new Engine(1800);

Car arr[] = new Car[10];

Car obj1 = new Car(e1);

obj1.setCarName("Tesla");
obj1.setCarPower(1000);

Car obj2 = new Car(e2);

obj2.setCarName("BMW");
obj2.setCarPower(2500);

Car obj3 = new Car(e1);

obj3.setCarName("Dodge");
obj3.setCarPower(1400);

// insert into an array

arr[0] = obj1;
arr[1] = obj2;
arr[2] = obj3;
// ---- iterate the array
// approach - 1
for (int i = 0; i < arr.length; i++) {
System.out.println(arr[i].getCarName()+" - "+arr[i].getCarPower());
}
System.out.println("-----------------------------------");
//Approach 2
for (Car car : arr) {
System.out.println(car.getCarName()+" --- "+car.getCarPower());



}
System.out.println("-----------------------------------");
for (Car car : arr) {
	if(car.getCarPower()<1500) {
		System.out.println(car.getCarName()+" --- "+car.getCarPower());
	}
}



}
	public void addCar(Car car) {
		
	}
	
}