package ex3_2;

class Customer<T> {
	private T id;
	public void setId(T id) {
		this.id = id;
	}
	public T getId() {
		return id;
	}
}

class Sample {
	public static void main(String[] args) {
		Customer<Integer> c1 = new Customer();
		Customer c2 = new Customer();
		c1.setId(500);
		c2.setId("505");
		Integer num = c1.getId();
		String str = c2.getId();
		
	}
}
