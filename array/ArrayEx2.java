package example.array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for(int i = 0; i < array.length; i++) {
           array[i] = scanner.nextInt();
        }
        System.out.println("출력");
        for(int i = 4; i >= 0; i--)
        {
            System.out.print(array[i]);
            if(i > 0 )
            System.out.print(", ");
        }

    }
}
