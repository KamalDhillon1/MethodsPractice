package GetterSetter;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Person person = new Person();
		System.out.println("Enter height");
		int height = sc.nextInt();
		System.out.println("Enter age");
		int age = sc.nextInt();
		person.setHeight(height);
		System.out.println("Height is:" + person.getHeight());
		person.setAge(age);
		System.out.println("Age is:" + person.getAge());

		if (person.isPersonEligible(height, age)) {
			System.out.println("Eligible for ride");
		} else
			System.out.println("Not eligible");

	}

}
