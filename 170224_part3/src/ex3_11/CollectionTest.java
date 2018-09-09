package ex3_11;

import java.util.TreeSet;

public class CollectionTest {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		for (int i = 10; i <= 30; i++) {
			if(i % 3 == 0) {
				tree.add(i);
			}
		}
		tree = (TreeSet<Integer>) tree.subSet(15, false, 21, true);
		for(int i : tree) {
			System.out.print(i + " ");
		}
		tree.add(null);
	}
}
