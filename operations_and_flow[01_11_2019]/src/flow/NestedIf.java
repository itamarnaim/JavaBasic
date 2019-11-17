package flow;

public class NestedIf {

	public static void main(String[] args) {

		String name = "Avi";
		int age = 17;

		if (age == 18)
			;
		{

			if (name.equals("Avi")) {
				System.out.println("avi age is 18");

			} else if (name.equals("avner")) {
				System.out.println("avner age is 18");

			} else {
				if (name.startsWith("A")) {
					System.out.println("start with A");

				}

			}

		}

	}

}
