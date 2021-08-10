package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		String changedString = "";
		char[] charArr = test.toCharArray();

		for (int i = 0; i < charArr.length; i++) {
			if (i % 2 != 0)
				charArr[i] = Character.toUpperCase(charArr[i]);
			changedString += charArr[i];
		}

		System.out.println("String after changing odd index to uppercase : " + changedString);

	}

}
