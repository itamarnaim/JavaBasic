package Runners;

import objects.Adress;
import objects.Person;

public class Runner {
	public static void main(String[] args) {

		Adress adress = new Adress("Beer-Sheva", "Ozi-Narkis", 18);
		Person person = new Person("Itamar", 32, adress);

		System.out.println(person);
	}

}
