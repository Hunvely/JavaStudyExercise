package example;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double avg = 0;


        System.out.print("입력 받을 숫자의 개수를 입력하세요 : ");
        int num = scanner.nextInt();
        System.out.println(num + "개의 정수를 입력하세요 : ");
        int[] array = new int [num];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        avg = (double) sum / num;

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + avg);
    }
}
