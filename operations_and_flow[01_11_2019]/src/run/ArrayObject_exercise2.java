package run;

public class ArrayObject_exercise2 {

	public static void main(String[] args) {
		int[] intArray = new int[50];
		int max = 0;
		int bigger = 0;
		int counter = 0;

		for (int i = 0; i < intArray.length; i++) {
			int randomNum = (int) (Math.random() * 100);

			intArray[i] = randomNum;

		}
		for (int i : intArray) {
			if (i > max) {
				max = i;

			}
			System.out.printf("the higest value is %d\n and is index is %d", max, intArray[i]);

		}

	}

}
