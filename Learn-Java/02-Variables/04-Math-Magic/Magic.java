public class Magic {
	public static void main(String[] args) {
		int myNumber = 5;
		int stepOne = myNumber * myNumber;
		int stepTwo = stepOne + myNumber;
		int stepThree = stepTwo / myNumber;
		int stepFour = stepThree + 17;
		int stepFive = stepFour - myNumber;
		int stepSix = stepFive / 6;

		System.out.println(stepSix);

		/*
		 * [Task 11] Recreate this project using only two variables: myNumber and
		 * magicNumber. Use your understanding of compound assignment operators to
		 * recreate the above program by only manipulating magicNumber.
		 */
	}
}