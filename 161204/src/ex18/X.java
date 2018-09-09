package ex18;
import java.io.*;

public class X {

	public void print() {
		// TODO Auto-generated method stub
		throw new IOException();
	}
	
}

class Sample {
	public static void main(String[] args) throws Exception{
		X obj = new X();
		obj.print();
	}
}