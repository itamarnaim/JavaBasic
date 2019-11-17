package All_Exercise_5_Conditions;

public class exercise_6 {

	public static void main(String[] args) {

		int salaryAfterTax = 0;

		int randomSalary = (int) (Math.random() * 150000);

		if (randomSalary > 0 && randomSalary < 23000) {

			salaryAfterTax = (int) ((int) randomSalary - (randomSalary * 0.1f));
			System.out.printf("The salary after tax is: %d", salaryAfterTax);

		} else if (randomSalary >= 23000 && randomSalary < 50000) {
			salaryAfterTax = (int) ((int) randomSalary - (randomSalary * 0.2f));
			System.out.printf("The salary after tax is: %d", salaryAfterTax);

		} else if (randomSalary >= 50000 && randomSalary <= 100000) {
			salaryAfterTax = (int) ((int) randomSalary - (randomSalary * 0.3f));
			System.out.printf("The salary after tax is: %d", salaryAfterTax);
		} else {
			salaryAfterTax = (int) ((int) randomSalary - (randomSalary * 0.4f));
			System.out.printf("The salary after tax is: %d", salaryAfterTax);

		}

	}

}
