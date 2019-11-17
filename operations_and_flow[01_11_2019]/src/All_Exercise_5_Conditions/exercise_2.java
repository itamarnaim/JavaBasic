package All_Exercise_5_Conditions;

public class exercise_2 {

	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() * 100);

		switch (randomNumber) {

		case 50:
			System.out.printf("Bingo!!!  %d", randomNumber);

		}

		if (randomNumber > 50) {
			System.out.printf("Big!  %d", randomNumber);
		}

		else {
			System.out.printf("Small !!  %d", randomNumber);
		}

	}

}
