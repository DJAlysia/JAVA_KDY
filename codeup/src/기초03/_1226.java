package 기초03;

import java.util.Scanner;

public class _1226 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lotto[] = new int[7];
		int my[] = new int[6];
		
		// 당첨 번호 7개 입력
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = sc.nextInt();
		}
		
		// 선택 번호 6개 입력
		for (int i = 0; i < my.length; i++) {
			my[i] = sc.nextInt();
		}
		
		int count = 0;
		// 번호 비교
		for (int i = 0; i < my.length; i++) {
			for (int j = 0; j < my.length; j++) {
				if( lotto[i] == my[j] ) {
					count++;
				}
			}
		}
		
		int rank = 0;
		switch (count) {
			case 6: rank = 1;	break;
			case 5: 
					rank = 3;	
					// 보너스 번호가 일치하는지?
					// lotto[6] : 보너스 번호
					for (int i = 0; i < my.length; i++) {
						if( my[i] == lotto[6] ) {
							rank = 2;
							break;
						}
					}			
					break;
			case 4: rank = 4;	break;
			case 3: rank = 5;	break;	
		}
		
		System.out.println(rank);
		
		sc.close();
	}
}
