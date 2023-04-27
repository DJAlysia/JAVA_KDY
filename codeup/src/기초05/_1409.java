package 기초05;

import java.util.Scanner;

public class _1409 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		// 10개의 숫자 입력
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		
		// k 입력
		int k =sc.nextInt();
		
		System.out.println( arr[k-1]);
		
		sc.close();
	}
}
