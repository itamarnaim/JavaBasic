package run;

public class ArrayObjectHomeExercise {

	public static void main(String[] args) {
		int[] intArray = new int[4];

		for (int i = 0; i < intArray.length; i++) {
			int random = (int) (Math.random() * 10);

			intArray[i] = random;
			System.out.printf("num %d at index %d\n", intArray[i], i);
		}
	}

}
