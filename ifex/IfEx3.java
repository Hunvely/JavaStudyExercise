package example;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("환전할 달러를 입력하세요 : ");
        int dollar = input.nextInt();

        if(dollar < 0) {
            System.out.println("dollar : " + dollar);
            System.out.println("출력 : 잘못된 금액입니다.");
        }
        else if(dollar == 0) {
            System.out.println("dollar : " + dollar);
            System.out.println("출력 : 환전 할 금액이 없습니다.");
        }
        else{
            int won = 1300 * dollar;
            System.out.println("dollar : " + dollar);
            System.out.println("출력 : 환전 금액은 " + won + "원입니다.");
        }
        }
}
