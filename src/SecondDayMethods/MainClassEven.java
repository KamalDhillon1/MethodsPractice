package SecondDayMethods;

import java.util.Scanner;

public class MainClassEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		IsEven even = new IsEven();

		
		boolean number1 = even.isNumberEven();
		System.out.println("number is even:" + number1);

		System.out.println("Enter value for num2");
		int num2 = sc.nextInt();
		boolean number2 = even.isItEven(num2);
		System.out.println("number is even:" + number2);
	}

}
