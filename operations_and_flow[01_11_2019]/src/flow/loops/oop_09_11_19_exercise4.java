package flow.loops;

public class oop_09_11_19_exercise4 {

	public static void main(String[] args) {
		int max = (int) (Math.random() * 40) + 1;
		int den = (int) (Math.random() * 40) + 1;

		for (int i = 0; i < max; i++) {
			if (i % den == 0) {
				System.out.println(i);
			}
		}

	}

}
