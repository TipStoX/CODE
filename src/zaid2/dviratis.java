package zaid2;

public class dviratis {

	// globalieji kintamieji
	String name;
	private int speed;

	// konstruktorius
	public dviratis() {
		System.out.println("Hello");
		speed = 10;
	}

	// metodai
	public void setName(String name_bike) {
		name = name_bike;
	}

	public void sayName() {
		System.out.println(name);
	}

	public String getName() {
		return name;
	}
}