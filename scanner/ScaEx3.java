package example.scanner;

import java.util.Scanner;

public class ScaEx3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("첫 번째 숫자를 입력하세요 (두 수 0 입력시 종료) : ");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 (두 수 0 입력시 종료) : ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("두 수의 합계는 : " + sum + " 입니다.");

            if(num1 == 0 && num2 == 0)
            {
                System.out.println("프로그램이 종료합니다.");
                break;
            }
        }
    }
}
