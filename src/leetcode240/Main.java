package leetcode240;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10, 13, 14, 17, 24}};
		
		int target = 10;
		
		System.out.println("Matrix: " + Arrays.deepToString(matrix));
		
		System.out.println("Target: " + target);
		
		CheckIfTargetExist solution = new CheckIfTargetExist();
		
		System.out.println("Solution: " + solution.searchMatrix(matrix, target));
	}
}
