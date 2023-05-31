package Prob.Ex02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int N = scanner.nextInt();

        int oddSum = 0;
        int evenSum = 0;

        StringBuilder oddFormula = new StringBuilder();
        StringBuilder evenFormula = new StringBuilder();
        StringBuilder divisors = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                oddSum += i;
                oddFormula.append(i);
                if (i != N - 1 && i != N) {
                    oddFormula.append(" + ");
                } else {
                    oddFormula.append(" = ");
                }
            } else {
                evenSum += i;
                evenFormula.append(i);
                if (i != N) {
                    evenFormula.append(" + ");
                } else {
                    evenFormula.append(" = ");
                }
            }

            if (N % i == 0) {
                divisors.append(i).append(" ");
            }
           
        }
        
        System.out.println("1번 줄: " + oddFormula + oddSum);
        System.out.println("2번 줄: " + evenFormula + evenSum);
        System.out.println("3번 줄: " + divisors);

    }
    
}