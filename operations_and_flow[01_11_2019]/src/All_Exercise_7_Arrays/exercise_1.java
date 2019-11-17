package All_Exercise_7_Arrays;

import java.util.Arrays;

public class exercise_1 {

	public static void main(String[] args) {
		int[] Array = new int[10];

		int sum = 0;
		int avg = 0;

		for (int i = 0; i < Array.length; i++) {
			int randomNumber = (int) (Math.random() * 100);

			Array[i] = randomNumber;
			sum = sum + Array[i];

		}

		avg = sum / Array.length;
		System.out.println(Arrays.toString(Array));
		System.out.printf("The sum is: %d\nThe avg is: %d", sum, avg);

	}

}
