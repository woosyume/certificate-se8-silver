package ex3_18;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeqTest {
	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<>(1);
		dq.addFirst("AA");
		dq.addFirst("BB");
		dq.addFirst("CC");
		System.out.println(dq.pollLast());
		System.out.println(dq.pollLast());
		System.out.println(dq.pollLast());
	}
}
