package objects;

public class Adress {

	public String city;
	public String street;
	public int number;

	public Adress(String city, String street, int number) {
		this.city = city;
		this.street = street;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Adress [city=" + city + ", street=" + street + ", number=" + number + "]";
	}

}
