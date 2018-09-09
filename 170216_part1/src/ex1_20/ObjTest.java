package ex1_20;

class Obj1{}
class Obj2 extends Obj1{
	public String toString() {
		return "Obj2";
	}
}

class Obj3 extends Obj2{
	@Override
	public String toString() {
		return "Obj3";
	}
}
class ObjTest {
	public static void main(String[] args) {
		Obj1 o1 = new Obj1();
		Obj2 o2 = new Obj2();
		Obj3 o3 = new Obj3();
		System.out.println(o1); // hashcode
		System.out.println(o2); // obj2
		System.out.println(o3); // obj3
	}
}
