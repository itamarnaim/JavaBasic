package flow;

public class Turnary {

	public static void main(String[] args) {
		int age = (int) (Math.random() * 50) + 10;

		String message = (age < 18) ? "cant drive" : (age >= 18 && age < 21) ? "can drive in the army" :

				(age > 21 && age < 24) ? "travel to india" : "play ping pong";

		System.out.printf("%d %s", age, message);

	}

}
