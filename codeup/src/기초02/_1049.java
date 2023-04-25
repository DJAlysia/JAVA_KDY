package 기초02;

import java.util.Scanner;

public class _1049 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		String result = "";
		if (a > b)
			result = "1";
		else if (a <= b) 
			result = "0";
		
		System.out.println(result);
		sc.close();
	}
}
