package Day09.Ex05_UserException;

// 사용자 정의 예외 클래스
// : public class ??Exception extends Exception { }
public class BalanceException extends Exception {
		// 노란 줄: 시리얼 버전 UID를 써야 한다는 뜻
		
	public BalanceException() {
		super();
	}

	public BalanceException(String message) {
		super(message);
	}			
	
}
