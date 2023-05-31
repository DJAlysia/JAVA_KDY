package Prob.Ex01;

import java.util.Scanner;

// javaMission 1. 합계와 평균 풀이

public class Ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //변수 선언
        int eng = sc.nextInt();
        int math = sc.nextInt();
        int java = sc.nextInt();

        //출력
        System.out.println("영어점수:"+ eng);
        System.out.println("수학점수:"+ math);
        System.out.println("자바점수:"+ java);
        System.out.println("총점:"+ (eng + math + java));
        System.out.println("평균:"+ (eng + math + java)/3);
        sc.close();
    }

}