package example;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;

        while (true) {

            System.out.println("------------------------");
            System.out.println("1. 입금  |  2. 출금  |  3. 잔액 확인  |  4. 종료");
            System.out.println("------------------------");
            System.out.print("메뉴 선택 : ");
            int menu = input.nextInt();

            if (menu == 1) {
                System.out.print("입금액을 입력하세요 : ");
                int depositMoney = input.nextInt();
                total = Deposit(total, depositMoney);
            }
            else if (menu == 2) {
                System.out.print("출금액을 입력하세요 : ");
                int withdrawMoney = input.nextInt();
                total = Withdraw(total, withdrawMoney);
            }
            else if (menu == 3) {
                System.out.println("현재 잔액은 " + total + "원입니다.");
            }
            else if (menu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("올바른 메뉴를 선택하세요.");
            }
        }
    }

    public static int Deposit(int total, int money) {
        total += money;
        System.out.println(money + "원을 입금하였습니다. 현재 잔액 : " + total);
        return total;
    }

    public static int Withdraw(int total, int money) {
        if(money <= total) {
            total -= money;
            System.out.println(money + "원을 출금하였습니다. 현재 잔액 : " + total);
        }
        else {
            System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return total;
    }
}
