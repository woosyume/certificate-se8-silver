package ex23;

public class SubSample extends Sample{
	int price;
	public SubSample(int price) {
		this.price = price;
	}
	
	public SubSample(String name, int num, int price) {
		super(name, num);
		this(price);
	}
}
