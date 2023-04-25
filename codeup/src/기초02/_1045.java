package 기초02;
/**
 * 정수 2개(a, b)를 입력받아
 * 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
 */
import java.util.Scanner;

public class _1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.printf("%.2f", (double) a / b);
		
		sc.close();
	}
}
