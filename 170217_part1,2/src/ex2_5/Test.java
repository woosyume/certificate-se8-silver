package ex2_5;

abstract class Parent{
	public abstract String getStr();
}
class Child extends Parent {
	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return "Up ";
	}
}
class GrandChild extends Child {
	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return "Up Up ";
	}
}
public class Test {
	public static void main(String[] args) {
		Parent a1 = new Child();
		Child a2 = new Child();
		GrandChild a3 = new GrandChild();
		System.out.println(a1.getStr() + a2.getStr() + a3.getStr());
	}
}
