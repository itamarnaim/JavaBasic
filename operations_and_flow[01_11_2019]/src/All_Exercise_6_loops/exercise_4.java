package All_Exercise_6_loops;

public class exercise_4 {

	public static void main(String[] args) {

		int max = (int) (Math.random() * 20);
		int den = (int) (Math.random() * 20);

		for (int i = 0; i < max; i++) {
			if (i % den == 0) {
				System.out.println(i);
			}
		}

	}

}
