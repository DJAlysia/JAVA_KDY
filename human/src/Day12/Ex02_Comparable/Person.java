package Day12.Ex02_Comparable;

public class Person implements Comparable<Person> {
		
	String name;		// 이름
	int age;			// 나이
	
	// 생성자

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter, setter

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getAge() {
		return age;
	}

	public final void setAge(int age) {
		this.age = age;
	}

	// 컬렉션의 객체를 비교기준을 지정하는 메소드
	
	@Override
	public int compareTo(Person o) {
		// this : 해당객체
		// o	: 비교객체
		// 나이순으로 오름차순
		
		// 방법1
		int thisAge = this.getAge();
		int comAge = o.getAge();
		
		if(thisAge > comAge) {
			return 1;
		}
		if(thisAge == comAge) {
			return 0;
		} 
		if(thisAge < comAge) {
			return -1;
		}
		
		// 방법2
		int gap = this.getAge() - o.getAge();
		return gap;
	}
	

	
}
