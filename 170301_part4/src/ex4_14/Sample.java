package ex4_14;

@FunctionalInterface
interface Edible {
	Food getFood(String name);
}

class Food {
	private String name;
	public Food(String name) {
		this.name = name;
	}
}

class Sample {
	public static void main(String[] args) {
		//Food lunch = Food("My Lunch")::new;
		Edible meal = Food::new;
		Food lunch = meal.getFood("My Lunch");
		System.out.println(lunch);
	}
}
