package Day12.Ex03_Comparator;

import java.util.Comparator;

public class User implements Comparator<User> {

	String id;
	String name;
	int age;
	// 생성자
	public User() {
	}
	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	// getter setter
	public final String getId() {
		return id;
	}
	public final void setId(String id) {
		this.id = id;
	}
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
	// to String
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(User o1, User o2) {
		// 정렬 기준 1 : 나이순 - 오름차순
		// 정렬 기준 2 : 이름순 - 오름차순
		
		// return 은 메소드를 종료 시키고 return 옆에 있는 값을 반환 시킴.
		if( o1.age > o2.age ) {
			return 1;			// 양수 리턴
		}
		
		if( o1.age < o2.age ) {
			return -1;
		}
//		if( o1.age == o2.age ) {    			// 중첩 if문 작성 필요 없음.
			
			if( o1.name.compareTo( o2.name ) > 0 ) {
				return 1;
			}
		
			if( o1.name.compareTo( o2.name ) < 0 ) {
				return -1;
			}
//		}
		
		return 0;
	}
	
	
}
