package flow;

public class HomeWork_01_11_2019 {

	public static void main(String[] args) {

		// exercise 1 page 17

//		Scanner input = new Scanner(System.in);
//
//		System.out.println("Enter first value");
//		int value1 = input.nextInt();
//
//		System.out.println("Enter second value");
//		int value2 = input.nextInt();
//
//		if (value2 > value1) {
//			System.out.println("Growing");
//
//		}
//
//		else {
//			System.out.println("The first value is bigger than the second value");
//		}

		// exercise 2 page 17

//		Scanner input = new Scanner(System.in);
//
//		System.out.println("Enter first value");
//		int value1 = input.nextInt();
//
//		System.out.println("Enter second value");
//		int value2 = input.nextInt();
//
//		if (value1 == value2) {
//			System.out.printf("%d the values are equals", value1);
//
//		} else if (value1 > value2) {
//
//			System.out.println(value1);
//
//		} else {
//			System.out.println(value2);
//		}

		// exercise 3 page 17

//		Scanner input = new Scanner(System.in);
//
//		System.out.println("Enter Number Please");
//		int number = input.nextInt();
//
//		if (number % 2 == 0) {
//			System.out.println("Even");
//
//		} else {
//			System.out.println("Odd");
//		}

		// exercise 4 page 17

//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter first value");
//
//		int value1 = input.nextInt();
//
//		System.out.println("Enter second value");
//		int value2 = input.nextInt();
//
//		String message = (value1 % value2 == 0) ? "Yes value1 divide whitout residue"
//				: (value2 % value1 == 0) ? "Yes value2 divide whitout residue"
//						: "the values do not divide into each other whitout remainder";
//
//		System.out.printf("%d %d %s", value1, value2, message);

		// exercise 5-A page 17

//		Scanner input = new Scanner(System.in);
//		System.out.println("enter first value");
//		int value1 = input.nextInt();
//
//		System.out.println("enter second value");
//		int value2 = input.nextInt();
//
//		if (value1 > value2) {
//			System.out.printf("%d is smaller than %d", value2, value1);
//
//		} else if (value2 > value1) {
//			System.out.printf("%d is smaller than %d", value1, value2);
//
//		} else {
//			System.out.printf("value1 %d and value2 %d are equels", value1, value2);
//		}

		// exercise 5-B page 17

//		Scanner input = new Scanner(System.in);
//		System.out.println("enter first value");
//		int value1 = input.nextInt();
//
//		System.out.println("enter second value");
//		int value2 = input.nextInt();
//
//		String message = (value1 > value2) ? "value2 is smaller than value2"
//				: (value2 > value1) ? "value1 is smaller than value1" : "tha values are equals";
//
//		System.out.printf("%d %d %s", value1, value2, message);

		// exercise 6 page 17

//		Scanner input = new Scanner(System.in);
//
//		System.out.println("Enter employee name:");
//		String name = input.nextLine();
//
//		System.out.println("enter employee salary:");
//		int salary = input.nextInt();
//
//		if (salary * 1.1 > 6000) {
//			salary = (int) (salary * 1.05f);
//
//		} else {
//			salary = (int) (salary * 1.1f);
//
//			System.out.printf("%s salary is %d", name, salary);
//		}

		// exercise 3 page 18

//		Scanner input = new Scanner(System.in);
//		System.out.println("enter first value");
//		int value1 = input.nextInt();
//
//		System.out.println("enter second value");
//		int value2 = input.nextInt();
//
//		System.out.println("enter third value");
//		int value3 = input.nextInt();
//
//		if (value2 > value1) {
//			System.out.println("Increasing");
//
//		} else if (value3 > value2) {
//			System.out.println("Increasing");
//
//		} else {
//			System.out.println("I think it is not good");
//
//		}

		// exercise 3-A page 18

//		Scanner input = new Scanner(System.in);
//		System.out.println("enter first value");
//		int value1 = input.nextInt();
//
//		System.out.println("enter second value");
//		int value2 = input.nextInt();
//
//		System.out.println("enter third value");
//		int value3 = input.nextInt();
//
//		if (value1 > value2 && value1 > value3) {
//			System.out.printf("The value %d is the bigger", value1);
//
//		} else if (value2 > value1 && value2 > value3) {
//			System.out.printf("The value %d is the bigger", value2);
//
//		} else if (value3 > value1 && value3 > value2) {
//			System.out.printf("The value %d is the bigger", value3);
//
//		} else if (value1 == value2 && value1 == value3) {
//			System.out.println("All values are equal :-)");
//
//		} else {
//			System.out.println("this program didnt do anything");
//
//		}

		// exercise 4 page 18

//		int random = (int) (Math.random() * 9999) + 1;
//		System.out.println(random);
//
//		if (random > 999) {
//			System.out.printf("to the random value %d have 4 digitis", random);
//
//		} else if (random >= 99 && random < 999) {
//			System.out.printf("to the random value %d have 3 digitis", random);
//
//		} else if (random >= 9 && random < 99) {
//			System.out.printf("to the random value %d have 2 digitis", random);
//
//		} else {
//			System.out.printf("to the random value %d have 1 digitis", random);
//
//		}

		// exercise 5 page 18

//		Scanner input = new Scanner(System.in);
//
//		System.out.println("Enter employee name:");
//		String name = input.nextLine();
//
//		System.out.println("enter employee salary:");
//		int salary = input.nextInt();
//
//		if (salary <= 23000) {
//			System.out.printf("for salary %d %s dont neet to pay tax", salary, name);
//
//		} else if (salary > 23000 && salary <= 46000) {
//			int tax = (int) (salary * 0.2f);
//
//			System.out.printf("%s need to pay %d for tax", name, tax);
//
//		} else if (salary > 46000 && salary <= 120000) {
//			int tax = (int) (salary * 0.3f);
//			System.out.printf("%s need to pay %d for tax", name, tax);
//
//		} else if (salary > 120000 && salary <= 220000) {
//			int tax = (int) (salary * 0.4f);
//			System.out.printf("%s need to pay %d for tax", name, tax);
//
//		} else {
//			int tax = (int) (salary * 0.5f);
//			System.out.printf("%s need to pay %d for tax", name, tax);
//
//		}

		// exercise 1 page 20

//		Scanner input = new Scanner(System.in);
//		System.out.println("enter first value");
//		int value1 = input.nextInt();
//
//		System.out.println("enter second value");
//		int value2 = input.nextInt();
//
//		System.out.println("enter third value");
//		int value3 = input.nextInt();
//
//		if (value1 < value2 && value1 < value3 && value2 < value3) {
//			System.out.printf("%d is the smallest value and then the value %d and then the value %d", value1, value2,
//					value3);
//
//		} else if (value1 < value2 && value1 < value3 && value3 < value2) {
//			System.out.printf("%d is the smallest value and then the value %d and then the value %d", value1, value3,
//					value2);
//
//		} else if (value2 < value1 && value2 < value3 && value1 < value3) {
//			System.out.printf("%d is the smallest value and then the value %d and then the value %d", value2, value1,
//					value3);
//
//		} else if (value2 < value1 && value2 < value3 && value3 < value1) {
//			System.out.printf("%d is the smallest value and then the value %d and then the value %d", value2, value3,
//					value1);
//
//		} else if (value3 < value1 && value3 < value2 && value1 < value2) {
//			System.out.printf("%d is the smallest value and then the value %d and then the value %d", value3, value1,
//					value2);
//
//		} else if (value3 < value1 && value3 < value2 && value2 < value1) {
//			System.out.printf("%d is the smallest value and then the value %d and then the value %d", value3, value2,
//					value1);
//
//		} else {
//			System.out.println("we need to think what is wrong");
//
//		}

	}

}
