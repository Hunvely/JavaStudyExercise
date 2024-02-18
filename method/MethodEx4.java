package example.method;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        int amount = 0;


        while (true) {
            System.out.println("---------------------");
            System.out.println("1. 입금  | 2. 출금  |  3. 잔액 확인  |  4. 종료");
            System.out.println("---------------------");
            System.out.print("선택 : ");
            int menuNumber = input.nextInt();

            if(menuNumber == 1){
                System.out.print("입금액을 입력하세요 : ");
                amount = input.nextInt();
                total = Deposit(total, amount);
            }

            else if(menuNumber == 2){
                System.out.print("출금액을 입력하세요 : ");
                amount = input.nextInt();
                total = Withdraw(total, amount);
            }
            else if (menuNumber == 3) {
                System.out.println("현재 잔액은 " + total + "원입니다.");
            }
            else if (menuNumber == 4) {
                System.out.println("프로그램을 종료합니다. 감사합니다.");
                break;
            }

            else
                System.out.println("올바른 메뉴 번호를 입력해 주세요.");
        }
    }
    public static int Deposit(int total, int depositAmount){
        total += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액 : " + total);
        return total;
    }

    public static int Withdraw(int total, int withdrawAmount){
        if(total >= withdrawAmount){
            total -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액 : " + total);
        }
        else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return total;
    }
}
