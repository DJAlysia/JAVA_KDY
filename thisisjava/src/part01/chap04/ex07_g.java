package part01.chap04;

import java.util.Scanner;

public class ex07_g {
    private static int balance = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("예금액> ");
                    int depositAmount = Integer.parseInt(scanner.nextLine());
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("출금액> ");
                    int withdrawAmount = Integer.parseInt(scanner.nextLine());
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                    break;
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }


    public static void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 예금되었습니다.");
    }

    public static void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public static void checkBalance() {
        System.out.println("현재 잔액은 " + balance + "원입니다.");
        
    }
   
}
