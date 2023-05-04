package part01.chap04.sec04;

import java.math.BigDecimal;		// 정확한 부동 소수점 계산이 가능한 코드

public class BigDecimalExample {

	public static void main(String[] args) {
		BigDecimal start = new BigDecimal("0.1");
		BigDecimal end = new BigDecimal("1.0");
		BigDecimal step = new BigDecimal("0.1");

		for (BigDecimal number = start; number.compareTo(end) <= 0; number = number.add(step)) {
			System.out.println(number);
		}
	}
}

