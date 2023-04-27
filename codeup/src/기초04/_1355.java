package 기초04;

import java.util.Scanner;

public class _1355 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			// 1 : 공백0, *5
			// 2 : 공백1, *4
			// 3 : 공백2, *3
			// 4 : 공백3, *2
			// 5 : 공백4, *1
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			// i : 1
			// j : 5 4 3 2 1
			// i : 2
			// j : 5 4 3 2
			// ...
			for (int j = N; j >= i  ; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
