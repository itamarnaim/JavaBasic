package All_Exercise_6_loops;

public class exercise_5 {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 10000);

		int sum = 0;
		int temp = number;
		int firstLeftDigitis = 0;
		int temp2 = 0;
		int counter = 0;
		int temp3 = number;

		while (temp > 10) {

			temp2 = temp /= 10;
			counter++;
			sum = sum + (temp3 % 10);
			temp3 = (int) temp3 / 10;

		}

		counter++;
		sum = sum + temp;
		firstLeftDigitis = temp;

		System.out.printf("the number is %d and is digitis number is %d\n", number, counter);
		System.out.printf("the first left dig is %d and the sum is %d", firstLeftDigitis, sum);

	}

}
