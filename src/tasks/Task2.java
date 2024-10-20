package tasks;

import java.util.Arrays;

public class Task2 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 5, 30, 31, 48, 47};
		System.out.println(firstSecondLargest(arr));
	}

	private static int firstSecondLargest(int[] arr) {
		int lagestElement= arr.length-1;
	Arrays.sort(arr);
	
	for(int i = lagestElement; i >=0; i--) {
		if(arr[i] !=arr[lagestElement]) {
			return arr[i];
		}
	}
	
		return -1;
	}

}
