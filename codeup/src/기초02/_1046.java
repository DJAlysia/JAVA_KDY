package 기초02;

import java.util.Scanner;

public class _1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = (a+b+c);
		double avg = (double)sum/3;
		
		System.out.printf("%d%n%.1f", (a+b+c), avg);
				
		sc.close();
	}
}
