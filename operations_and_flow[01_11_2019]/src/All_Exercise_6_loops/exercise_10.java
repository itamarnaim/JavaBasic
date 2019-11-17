package All_Exercise_6_loops;

public class exercise_10 {

	public static void main(String[] args) {

		int number = (int) (Math.random() * 100);

		int temp = number;
		int temp2 = 0;

		while (temp > 0) {

			temp = temp % 10;
			temp2 = temp;
			temp = (int) temp / 10;

			if (temp2 == 7) {
				System.out.println("Boom");

			} else if (number % 7 == 0) {
				System.out.println("Boom");

			} else {
				System.out.println(number);
			}

		}

	}

}
