package Prob.Ex06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("몇 게임?");
    int N = sc.nextInt();

    //N번 반복
    for (int i = 0; i < N; i++) {
        int lotto[] = new int[6];
        System.out.print("[" + (i+1) + "게임] : ");

        //6번 반복
        for (int j = 0; j < lotto.length; j++) {
            // 1~45 랜덤수
            int random= (int)(Math.random() * 45 +1);
            lotto[j] = random;
            //중복 제거
            for (int k = 0; k < j; k++) {
                //중복
                if(random == lotto[k]) {
                    j--;
                    break;
                }                    
            }
            //System.out.print(lotto[j] + " ");
        }
                //System.out.println();
        //정렬
        Arrays.sort(lotto);

        for (int num : lotto) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    sc.close();
}
}