package Day11.Ex04_WildCard;

public class Person {

	private String name;

	// 생성자
	public Person(String name) {
		this.name = name;
	}

	// getter, setter
	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	// toString
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
