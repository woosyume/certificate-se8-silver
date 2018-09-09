package ex2_19;
interface Mobile {
	void running();
}

class Bike implements Mobile {

	@Override
	public
	void running() {
		System.out.println("Bike Run");
	}
	
}

class MainSample {
	public static void main(String[] args) {
		Mobile b = new Bike();
		b.running();
	}
}
