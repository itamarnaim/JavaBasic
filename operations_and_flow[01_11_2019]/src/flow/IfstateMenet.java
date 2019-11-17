package flow;

public class IfstateMenet {

	public static void main(String[] args) {

		int random = (int) (Math.random() * 60) + 18;

		if (random < 18) {
			System.out.printf("%d cant drive", random);
		} else if (random >= 18 && random <= 21) {
			System.out.printf("%d can drive in the army", random);

		} else if (random > 21 && random < 24) {
			System.out.printf("%d travael to India", random);
		}

		else {
			System.out.printf("%d Play ping pong", random);
		}
	}
}