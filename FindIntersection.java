package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };
		int[] arr3 = new int[arr1.length];
		int k = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr3[k] = arr1[i];
					k++;
					break;
				}
			}
		}

		System.out.print("Intersection numbers of two arrays are : { ");
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] != 0)
				System.out.print(arr3[i] + " ");
		}
		System.out.print("}");

	}

}
