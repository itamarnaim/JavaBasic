package run;

import java.util.Arrays;

public class ArrayObject_exercise4 {

	public static void main(String[] args) {
		int[] Array1 = new int[10];
		for (int i = 0; i < Array1.length; i++) {

			int num = (int) (Math.random() * 10);

			Array1[i] = num;

		}

		System.out.println(Arrays.toString(Array1));

		int start = 0;
		int end = Array1.length - 1;
		while (start < end) {
			// swap the values at the left and right indices
			int temp = Array1[start];
			Array1[start] = Array1[end];
			Array1[end] = temp;
			// increase start counter
			start++;
			// decrease end counter
			end--;
		}
		System.out.println("After");
		for (int num : Array1) {
			System.out.print(num);
			System.out.print(" ");

		}

	}
}
