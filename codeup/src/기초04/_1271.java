package 기초04;

import java.util.Scanner;

/**
 * 입력의 개수 n이 입력되고 n개의 데이터가 입력된다.
 * 이 n개의 데이터 중 최댓값을 출력한다.
 * (입력 예시)
 * 5
 * 10 5 3 2 20
 * (출력 예시)
 * 20
 * @author 휴먼
 *
 */
public class _1271 {

	public static void main(String[] args) {
		// 1. N 을 입력
		// 2. N 번 반복을 한다.
		// 3. N 번 반복하면서, 숫자를 입력 받는다.
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0; 			// 최댓값
		
		for(int i = 0 ; i < N ; i++) {
			int input = sc.nextInt();
			
			if( max < input ) 
				max = input;
				
			// System.out.println(input);
			
		}
		
		System.out.println(max);
		
		sc.close();
	}
}
