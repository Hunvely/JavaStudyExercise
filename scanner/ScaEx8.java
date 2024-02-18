package example.scanner;

import java.util.Scanner;

public class ScaEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요 : ");
        int num = scanner.nextInt();

        System.out.println(num + "의 구구단 :");
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
}
