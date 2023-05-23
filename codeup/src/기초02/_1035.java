package 기초02;

import java.util.Scanner;

public class _1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String b = sc.nextLine();
		a=Integer.valueOf(b, 16);
		System.out.println(Integer.toOctalString(a));
		sc.close();
	}
}
