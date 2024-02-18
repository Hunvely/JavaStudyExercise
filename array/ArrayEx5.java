package example.array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하세요 : ");
        int count = scanner.nextInt();

        int[] array = new int[count];
        System.out.println(count + "개의 정수를 입력하세요 : ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];

        for(int i = 0; i  < array.length; i ++){
            if(array[i] < min ){
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);
    }
}
