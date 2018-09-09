package ex9;

public class Sample {
	private int num;
	private String name;
	public Sample(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			System.out.println("kokozyanai");
			return false;
		}
		if(obj instanceof Sample) {
			System.out.println(this.name);
			Sample s = (Sample) obj;
			return s.num == this.num;
		}
		return false;
	}
}
