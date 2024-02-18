package example.scanner;

import java.util.Scanner;

public class ScaEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true)
        {
            System.out.print("숫자를 입력하세요 (0 입력시 종료) : ");
            int num = scanner.nextInt();
            sum += num;
            System.out.println("사용자가 입력한 숫자의 합은 : " + sum);
            if(num == 0)
            {
                System.out.println("프로그램을 종료헙니다~");
                break;
            }
        }
    }
}
