package All_Exercise_7_Arrays;

import java.util.Arrays;

public class exercise_3 {

	public static void main(String[] args) {

		int[] Array = new int[10];

		for (int i = 0; i < Array.length; i++) {

			int randomNumber = (int) (Math.random() * 10);
			Array[i] = randomNumber;
			Arrays.sort(Array);

		}

		System.out.println(Arrays.toString(Array));

		int[] noDuplicatesArray = Arrays.stream(Array).distinct().toArray();
		System.out.println(Arrays.toString(noDuplicatesArray));

	}
}
