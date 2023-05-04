package part01.chap04.sec04;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum); 		// 루프가 종료되고 난 후의 i 값은 101임.
	}
}
