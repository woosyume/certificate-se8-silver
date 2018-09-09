package ex61;

interface X {
	String msg = "Hello";
	void execute();
}

interface Y{}

interface Z extends X, Y {
	public void execute(String str);
}
