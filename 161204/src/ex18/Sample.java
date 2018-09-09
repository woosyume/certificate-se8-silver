package ex18;

import java.io.IOException;

class Y	{

	public void print() {
		// TODO Auto-generated method stub
		throw new IOException();
	}

}

public class Sample {
	public static void main(String[] args) throws Exception{
		Y y = new Y();
		y.print();
		
	}
}


