package part01.chap02.sec01;

public class VariableExchangeexample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		// 임시 변수를 활용하여 변수 값 교환하기
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		
		// XOR을 사용하여 변수 값 교환하기
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("x:" + x + ", y:" + y);
	}
}