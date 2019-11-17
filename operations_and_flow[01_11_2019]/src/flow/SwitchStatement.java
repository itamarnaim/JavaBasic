package flow;

public class SwitchStatement {

	public static void main(String[] args) {
		int age = (int) (Math.random() * 50) + 10;

		switch (age) {

		case 18:
			System.out.printf("%d can drive", age);
			break;

		case 19:
		case 20:
		case 21:

			System.out.printf("%d can drive in the army", age);
			break;

		case 24:
			System.out.printf("%d travel to india and play ping pong", age);
			break;
		default:
			System.out.printf("%d cant drive", age);

		}

	}

}
