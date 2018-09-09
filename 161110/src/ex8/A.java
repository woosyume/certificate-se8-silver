package ex8;

class A {
	String val = "A";
	void print() {
		System.out.println(val);
	}
}

class B extends A{
	String val = "B";
	void print(){
		System.out.println(val);
	}
	
}

class C extends B{
	String val = "C";
}
