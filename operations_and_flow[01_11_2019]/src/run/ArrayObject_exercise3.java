package run;

import java.util.Arrays;

public class ArrayObject_exercise3 {

	public static void main(String[] args) {
		int[] Array1 = new int[10];
		for (int i = 0; i < Array1.length; i++) {

			int num = (int) (Math.random() * 10);

			Array1[i] = num;
			Arrays.sort(Array1);

		}
		System.out.println(Arrays.toString(Array1));

		int[] unique = new int[Array1.length];
		int prev = Array1[0];
		unique[0] = prev;

		int count = 1;

		for (int i = 1; i < Array1.length; ++i) {

			if (Array1[i] != prev) {
				unique[count] = Array1[i];
				count++;

			}
			prev = Array1[i];
		}
		System.out.println(Arrays.toString(unique));
		int[] finalArray1 = new int[count];
		System.arraycopy(unique, 0, finalArray1, 0, count);

		System.out.println(Arrays.toString(finalArray1));

	}

}
