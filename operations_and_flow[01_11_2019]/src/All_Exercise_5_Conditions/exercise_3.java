package All_Exercise_5_Conditions;

public class exercise_3 {

	public static void main(String[] args) {

		int randomNumber = (int) (Math.random() * 100) + 0;

		if (randomNumber > 0 && randomNumber <= 50) {
			System.out.printf("The randomNumber: %d is Small!\n", randomNumber);
		} else {
			System.out.printf("The randomNumber: %d is Big!\n", randomNumber);
		}

		if (randomNumber % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

}
