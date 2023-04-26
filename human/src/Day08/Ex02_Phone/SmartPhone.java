package Day08.Ex02_Phone;

public class SmartPhone extends Phone {

	// 생성자
	public SmartPhone(String owner) {  				// 추상메소드만 자식 클래스에서 재정의
		super(owner);
	}

	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다...");
	}
}
