package ex61;

public class Sample {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int key = 3;
		int cnt = 0;
		for(int i : array) {
			if(i != key) {
				cnt++;
				continue;
			}
		}
	}
}
