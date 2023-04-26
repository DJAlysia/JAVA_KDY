package Day08.Ex02_Phone;

public abstract class Phone {

	// 변수
	public String owner;		// phone 사용자명

	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}

	// 메소드     (추상 메소드, 일반 메소드 둘 다 가능함)
	public void turnOn() {
		System.out.println("전원 켭니다...");
	}
	
	public void turnOff() {
		System.out.println("전원 끕니다...");
	}
	
	
}
