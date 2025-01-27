package lesson34.lambdas2;

import java.util.function.Supplier;
import java.util.ArrayList;

public class TestCar {

	public static ArrayList<Car> createThreeCars(Supplier<Car> s) {
		ArrayList<Car> threeCars = new ArrayList<Car>();

		for (int i = 0; i < 3; i++) {
			threeCars.add(s.get());
		}
		return threeCars;
	}

	public static void main(String[] args) {

		ArrayList<Car> ourCars = createThreeCars(() -> new Car("Ford Kuga", "Dark Blue", 2.5));

		ourCars.forEach((element) -> {
			if (ourCars.indexOf(element) != 0 && ourCars.indexOf(element)%2 !=0) {
				element.color = "white";
				element.engine = 2.3;}
			System.out.println(element);
		});
	}

}
