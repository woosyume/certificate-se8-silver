package ex3_3;

import java.util.ArrayList;

class ArrayTest {
	public static void main(String[] args) {
		ArrayList<Test> list = new ArrayList<>();
		list.add(new ExTest());
		list.add(new ExTest2());
		for(Test t : list) {
			t.bar();
			t.foo();
		}
	}
}

interface Test {
	public abstract void bar();

	public abstract void foo();
}

class ExTest implements Test {
	@Override
	public void bar() {
	}
	public void foo(){}
}
class ExTest2 extends ExTest {
	public void foo(){}
}