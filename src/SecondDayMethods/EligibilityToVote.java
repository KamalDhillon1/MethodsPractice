package SecondDayMethods;

public class EligibilityToVote {

	//int age;
	//String status = "";

	//boolean isEligibleToVote() {
	//	if (age > 18 && status.equals("citizen")) {
		//	return true;
		//}
		//return false;
	//}

	boolean isEligible(int age1, String status) {
		if (age1 > 18 )
		if (status.equals ("citizen")) {
			return true;
		}
		return false;

	}
}
