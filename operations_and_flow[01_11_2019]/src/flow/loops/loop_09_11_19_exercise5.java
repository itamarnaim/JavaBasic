package flow.loops;

public class loop_09_11_19_exercise5 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 10000) + 1;
		int firstLeftDigitis = 0;
		int sum = 0;
		int temp = num;
		int temp2 = 0;
		int counter = 0;
		int temp3 = num;

		while (temp > 10) {

			temp2 = temp /= 10;
			counter++;

			sum = sum + (temp3 % 10);
			temp3 = (int) temp3 / 10;

		}
		{
			counter++;
			sum = sum + temp;
			firstLeftDigitis = temp;

			System.out.printf("the number is %d and is digitis number is %d\n", num, counter);
			System.out.printf("the first left dig is %d and the sum is %d", firstLeftDigitis, sum);
		}
	}
}
