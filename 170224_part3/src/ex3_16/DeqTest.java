package ex3_16;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeqTest {
	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>();
		dq.push(400);
		dq.push(600);
		dq.push(200);
		dq.push(800);
		
		dq.addFirst(900);
		System.out.println(dq);
		Integer a = dq.;
		System.out.println(a);
	}
}
