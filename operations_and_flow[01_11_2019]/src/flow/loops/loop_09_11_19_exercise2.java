package flow.loops;

public class loop_09_11_19_exercise2 {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 10) + 1;
		int number2 = (int) (Math.random() * 10) + 1;

		int temp = 0;
		if (number2 < number) {
			temp = number2;
			number2 = number;
			number = temp;

		}
		for (int i = number; i < number2; i++) {
			System.out.println(i);
		}

	}

}
