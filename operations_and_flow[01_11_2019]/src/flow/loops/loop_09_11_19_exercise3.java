package flow.loops;

public class loop_09_11_19_exercise3 {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 40) + 1;

		for (int i = 0; i < number; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
