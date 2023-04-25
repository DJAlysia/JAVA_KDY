package 기초03;

import java.util.Scanner;

public class _1231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0;
		
		String operator = null;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		switch(operator) {
			case "+": {
				c = a + b;
				break;
			}
			case "-": {
				c = a - b;
				break;
			}
			case "*": {
				c = a * b;
				break;
			}
			case "/": {
				c = a / b;
				break;
			}
			default: {
				System.exit(0);
			}
				break;
		}
		
		System.out.println();
		System.out.print(a + operator + b);
		System.out.println(c);
		
		sc.close();
		
	}
}
