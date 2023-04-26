package 기초05;

import java.util.Scanner;

public class _1465 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] c = new int[a][b];
		int result=a*b;
		
		for (int i = 0; i < a; i++) { 
			for (int j = b-1; j >= 0; j--) { 
				c[i][j]=result;
				result--;
			}
			for (int j = 0; j < b; j++) { 
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
