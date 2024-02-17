package example;

import java.util.Scanner;

public class ScaEx1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");

        int va1 = scanner.nextInt();

        System.out.print("숫자를 입력하세요 : ");
        int va2 = scanner.nextInt();

        int sum = va1 + va2;

        if(va1 > va2)
        {
            System.out.println("더 큰 숫자는 : " + va1);
        }
        else if(va2 > va1)
        {
            System.out.println("더 큰 숫자는 : " + va2);
        }
        else System.out.println("둘 다 숫자가 똑같습니다");

        System.out.println("두 수의 합은 : " + sum);
    }
}
