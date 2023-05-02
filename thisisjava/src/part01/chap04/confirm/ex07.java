package part01.chap04.confirm;

import java.util.Scanner;

public class ex07 {
	private static int balance = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N;
		int price;
		int remain = 0;
		
		while (true) {

			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			N = sc.nextInt();
			if (N == 4) {
				break;
			}
			
			switch (N) {
				case 1: {
					System.out.print("예금액> ");
					price = sc.nextInt();
					remain = remain + price;
					break;
				}
				case 2: {
					System.out.print("출금액> ");
					price = sc.nextInt();
					remain = remain - price;
					break;
				}
				case 3: {
					System.out.print("잔고> " + remain);	
					break;
				}	
			}
		}
		System.out.println("프로그램 종료");

	}

}