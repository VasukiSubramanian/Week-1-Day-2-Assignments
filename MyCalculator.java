package week1.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();

		int add = cal.add(1, 2, 3);
		System.out.println("Addition : " + add);

		int sub = cal.sub(5, 2);
		System.out.println("Subtraction : " + sub);

		double mul = cal.mul(2.5, 5.2);
		System.out.println("Multiplication :" + mul);

		float div = cal.div(100.0f, 5.0f);
		System.out.println("Division : " + div);

	}

}
