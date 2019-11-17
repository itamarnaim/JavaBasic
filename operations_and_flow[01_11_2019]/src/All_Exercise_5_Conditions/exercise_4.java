package All_Exercise_5_Conditions;

public class exercise_4 {

	public static void main(String[] args) {

		int salary = 0;

		int random = (int) (Math.random() * 6000);

		if (random < 5999) {
			salary = (int) (salary + random * 1.10f);
			System.out.printf("The salary is: %d", salary);

		}

	}

}
