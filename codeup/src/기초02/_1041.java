package 기초02;

import java.util.Scanner;

public class _1041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.nextLine().charAt(0);
		int b = (int)a+1;
		
		a = (char)b;
		System.out.println(a);
		sc.close();
	}
}
