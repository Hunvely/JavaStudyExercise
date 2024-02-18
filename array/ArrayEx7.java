package example.array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요 : ");
        int num = scanner.nextInt();

        int[][] students = new int[num][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요 :");
            for(int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + "점수 : ");
                students[i][j] = scanner.nextInt();
            }
            System.out.println("----------------------");
        }
        System.out.println();

        for(int i = 0; i < num; i++) {
            int sum = 0;
            for(int j = 0; j < 3; j++) {
                sum += students[i][j];
            }
            double avg = (double) sum / 3;
            System.out.print((i + 1) + "번 학생의 총점 : " + sum + ", ");
            System.out.println(" 평균 : " + avg);
            System.out.println("----------------------");
        }
    }
}
