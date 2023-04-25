package 기초02;

import java.util.Scanner;

public class _1149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a>b) {
			System.out.println(a);
		}
		
		else if (b>a) {
			System.out.println(b);
		}
		
		// System.out.println( a > b ? a : b ); 		// 다른 풀이
		
		sc.close(); 
		
	}
}
