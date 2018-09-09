package ex4_15;

import java.util.function.Supplier;

class Car {
	public void run() {
		System.out.println("4 passengers");
	}
}

class Bus extends Car{
	public void run() {
		System.out.println("30 passengers");
	}
}

class DrivingCar {
	public static void main(String[] args) {
		run(() -> new Car());
		run(Bus::new);
	}
	static void run(Supplier<Car> car) {
		car.get().run();
	}
}
