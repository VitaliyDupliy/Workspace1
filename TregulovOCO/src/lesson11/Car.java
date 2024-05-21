package lesson11;

public class Car {

	String color;
	String engine;
    int numberDors;
    
	public Car(String color, String engine, int numberDors) {
		super();
		this.color = color;
		this.engine = engine;
		this.numberDors = numberDors;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", engine=" + engine + ", numberDors=" + numberDors + "]";
	}
    
    
	
}

 class CarTest{
	
	 public static void changeNumberDors(int n, Car car) {
		 car.numberDors = n;
		 System.out.println("changeNumberDors: \n" + car);
	 }
	 
	 public static void swapColor(Car car1, Car car2) {
		 String intermediate = car1.color;
		 car1.color = car2.color;
		 car2.color = intermediate;
		 System.out.println("swapColor: ");
		 System.out.println(car1);
		 System.out.println(car2);
	 }
	 
	 public static void main(String[] args) {
		
		 Car car1 = new Car("Yellow", "V6", 4);
		 Car car2 = new Car("REd", "V4", 2);
		 
		 changeNumberDors(3, car1);
		 System.out.println("*******************");
		 System.out.println(car1);
		 
		 swapColor(car1,car2);
		 System.out.println("*******************");
		 System.out.println(car1);
		 System.out.println(car2);
	}
}