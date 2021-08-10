package week1.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int length = arr.length, count, k = 0;
		int[] dupArr = new int[length];

		for (int i = 0; i < length - 1; i++) {
			count = 0;
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					count = 1;
					break;
				}
			}

			if (count > 0) {
				boolean flag = true;
				for (int j = 0; j < dupArr.length; j++) {
					if (arr[i] == dupArr[j]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					dupArr[k] = arr[i];
					k++;
				}

			}
		}

		System.out.print("Duplicate numbers of given array are : { ");
		for (int i = 0; i < dupArr.length; i++) {
			if (dupArr[i] != 0)
				System.out.print(dupArr[i] + " ");
		}
		System.out.print("}");

	}

}
