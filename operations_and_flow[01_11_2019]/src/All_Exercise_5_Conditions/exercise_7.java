package All_Exercise_5_Conditions;

public class exercise_7 {

	public static void main(String[] args) {

		int year = (int) (Math.random() * 2500) + 200;

		if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
			System.out.printf("The year is: %d and she leap year", year);
		} else {
			System.out.printf("The year is: %d and she is not leap year", year);

		}

	}

}