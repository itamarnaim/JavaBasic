package All_Exercise_5_Conditions;

public class exercise_1 {

	public static void main(String[] args) {

		int value1 = (int) (Math.random() * 100) + 1;
		int value2 = (int) (Math.random() * 100) + 1;

		if (value1 > value2) {
			System.out.printf("value1: %d is bigger than value2: %d", value1, value2);
		} else {
			System.out.printf("value2: %d is bigger than value1: %d", value2, value1);

		}

	}

}
