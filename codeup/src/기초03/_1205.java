package 기초03;

import java.util.Scanner;

public class _1205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ctrl + backspace 시, 단어 단위로 지워짐(카멜 입력 스타일에 맞춰)
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		/*
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a * a);
		System.out.println(b * b);
		System.out.println(b + a);
		System.out.println(b - a);
		System.out.println(b * a);
		System.out.println(b / a);
		*/
		
		// 제곱
		//System.out.println( Math.pow(a, b) );
		//System.out.println( Math.pow(b, a));
		
		double[] arr = { a+b, a-b, a*b, a/b, Math.pow(a, b), Math.pow(b, a), b+a, b-a, b*a, b/a};
		double max = arr[0];
		for (double num : arr) {
			if (num > max) {
				max = num;
			}
		}
		
		
		System.out.printf("%.6f", (double) max);
		
		
		sc.close();
	}
}
