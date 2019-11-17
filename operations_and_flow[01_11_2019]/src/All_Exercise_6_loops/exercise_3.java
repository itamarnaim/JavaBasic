package All_Exercise_6_loops;

public class exercise_3 {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 20);

		for (int i = 0; i < random; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
