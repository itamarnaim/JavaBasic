package objects;

public class Person {

	public String name;
	public int age;
	public Adress adress;

	public Person(String name, int age, Adress adress) {
		this.name = name;
		this.age = age;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", adress=" + adress + "]";
	}

}