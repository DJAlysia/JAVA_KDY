package Exam;

import java.util.Scanner;

public class Answer_369 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
			try {
				N = sc.nextInt();
			} catch (Exception e) {
				System.err.println("정수를 입력하세요.");
			}
			
			for (int i = 1; i <= N; i++) {
				int one = i % 10;	
				int ten = i / 10;	
				boolean one369 = (one == 3 || one == 6 || one == 9);	
				boolean ten369 = (ten == 3 || ten == 6 || ten == 9);	
				
				if (one369 && ten369) {					
					System.out.print("**");
				} 
				else if (one369 || ten369) {					
					System.out.println("*");	
				}
				else {
					System.out.println(i);
				}
			}
			sc.close();
		}
	}
	
