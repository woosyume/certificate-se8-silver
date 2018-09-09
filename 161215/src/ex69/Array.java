package ex69;

public class Array {
	public static void main(String[] args) {
		int[][] array = {{1,2,3}, {4,5,6}};
		//int[][][] array2 = {{1,2}, {3,4}, {5,6}};
		//int[][] array3 = {0,1};
		int[][] array4 = new int[2][];
		array[0][0] = 1;
		array[0][1] = 2;
		array[1][0] = 3;
		array[1][1] = 4;
		
		int[] array5 = {0,1};
		int[][][] array6 = new int[2][2][2];
		array6[0][0] = array5;
	} 
}
