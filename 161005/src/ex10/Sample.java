package ex10;

public class Sample {
	private int num;
	public Sample(int num) {
		this.num = num;
	}
	
	public boolean equals(Sample obj) {
		if(obj == null) return false;
		return this.num == obj.num;
		
	}
}
