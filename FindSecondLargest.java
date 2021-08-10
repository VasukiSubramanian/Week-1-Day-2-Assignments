package week1.day2.assignments;

import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(data);
		Collections.reverse(Arrays.asList(data));
		System.out.println("Second Largest number of the array is : " + data[data.length - 2]);

	}

}
