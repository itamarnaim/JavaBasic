package run;

public class ArrayObject_exercise1 {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < intArray.length; i++) {
			int num = (int) (Math.random() * 100);
			intArray[i] = num;

			sum = sum + intArray[i];
			avg = sum / 10;

			System.out.printf("the total sum is %d and avg is %d\n", sum, avg);

		}
	}
}
