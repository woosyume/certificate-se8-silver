package ex3_17;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeqTest {
	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<>();
		dq.offer("apple");
		dq.offer("orange");
		dq.offer("banana");
		dq.offer("peach");
		System.out.println(dq.remove());
	}
}
