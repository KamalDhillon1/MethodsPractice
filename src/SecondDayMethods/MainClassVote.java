package SecondDayMethods;

import java.util.Scanner;

public class MainClassVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
       
		
		EligibilityToVote vote = new EligibilityToVote();
		System.out.println("Enter status in Canada");
		String status = sc.next();
		System.out.println("Enter age");
		int age1 = sc.nextInt();

		boolean eligible = vote.isEligible(20, status);
		System.out.println("eligible:" + eligible);
	}

}
