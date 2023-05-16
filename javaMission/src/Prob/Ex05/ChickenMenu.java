package Prob.Ex05;

import java.util.Scanner;

public class ChickenMenu {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            menu();
            System.out.print("********** 번호 : ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("\n총 " + count + " 개의 상품이 주문되었습니다.");
                    break;
                case 1:
                    chicken("황금올리브 반반한 치킨");
                    break;
                case 2:
                    chicken("뿌잉클 치킨");
                    break;
                case 3:
                    chicken("처갓집에서 호식이가 만든 치킨");
                    break;
                default:
                    System.out.println("\n(0~3) 사이의 번호를 입력해주세요.");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
 

    public static void menu() {
        System.out.println("********** 치킨 메뉴판 **********");
        System.out.println("1. 황금올리브 반반한 치킨");
        System.out.println("2. 뿌잉클 치킨");
        System.out.println("3. 처갓집에서 호식이가 만든 치킨");
        System.out.println("0.    종료");
    }

    public static void chicken(String menu) {
        System.out.println("\n'" + menu + "'이(/가) 주문되었습니다.");
        count++;
    }
}


