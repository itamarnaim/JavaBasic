package All_Exercise_7_Arrays;

import java.util.Arrays;

public class exercise_4 {

	public static void main(String[] args) {

		int[] Array = new int[10];
		for (int i = 0; i < Array.length; i++) {

			int numbers = (int) (Math.random() * 10);

			Array[i] = numbers;

		}
		System.out.println(Arrays.toString(Array));

		for (int i = Array.length - 1; i >= 0; --i) {

			System.out.println(Array[i]);
		}
	}
}
