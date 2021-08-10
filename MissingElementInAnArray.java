package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		int j = 0;

		for (int i = arr[0]; i < arr.length; i++) {
			if (i != arr[j]) {
				System.out.println("Missing Element is : " + i);
				break;
			}
			j++;
		}

	}

}
