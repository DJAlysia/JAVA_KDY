package Exam;

//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class ThreeSixNine {
//
//	public static void main(String[] args) {
//		try {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		for (int i = 1; i <= N; i++) {
//			int one = i % 10;	
//			int ten = i / 10;	
//			boolean one369 = (one == 3 || one == 6 || one == 9);	
//			boolean ten369 = (ten == 3 || ten == 6 || ten == 9);	
//			
//			if (one369 || ten369) {
//			    System.out.print("*");
//			    System.out.println();
//			} else {
//			    System.out.println(i);
//			}
//		}
//		sc.close();
//		} catch (Exception e) {
//            System.out.println("입력이 잘못되었습니다.");
//        }
//	}
//}

import java.util.Scanner;
import java.util.InputMismatchException;
public class ThreeSixNine {
	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);	  
             try{
               int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			int one = i % 10;	
			int ten = i / 10;	
			boolean one369 = (one == 3 || one == 6 || one == 9);	
			boolean ten369 = (ten == 3 || ten == 6 || ten == 9);	
			
			if (one369 || ten369) {					
				System.out.print("*");	
				System.out.println();	
			} else {					
				System.out.println(i);	
			}
		}
		sc.close();
            } catch (InputMismatchException e) {
                System.out.println("입력이 잘못되었습니다.");
            }
	}
}



