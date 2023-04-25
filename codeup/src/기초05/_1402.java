package 기초05;

import java.util.Scanner;

public class _1402 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// arr[]
		// i : 0 1 2 3 4
		// i : 4 3 2 1 0
		for (int i = N-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}
