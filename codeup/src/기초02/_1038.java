package 기초02;

import java.util.Scanner;

public class _1038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = sc.next();
		
		long a, b;
		a = Long.parseLong(x);
		b = Long.parseLong(y);
		System.out.println(a+b);
		sc.close();
	}
}
