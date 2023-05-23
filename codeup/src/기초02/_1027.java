package 기초02;

import java.util.Scanner;

public class _1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String date[] = a.split("\\.");
		
		System.out.println(date[2]+"-"+date[1]+"-"+date[0]);
		sc.close();
	}
}
