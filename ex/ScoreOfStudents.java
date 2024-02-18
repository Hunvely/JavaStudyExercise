package example;
import java.util.Scanner;

public class ScoreOfStudents {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.println("학생의 수를 입력하고 점수를 받으세요. 또한 학생의 점수에 따라 A부터 F까지 나누어 출력하세요.");
        System.out.println("90이상이면 A, 80이상 90이하면 B, 70이상 80이하면 C, 60이상 70이하면 D 이외에는 F 입니다.");

                System.out.print("학생의 수를 입력해주세요 : ");
        int numberOfStudents = sc.nextInt();

        int [] scores = new int[numberOfStudents];
        String [] nameOfStudents = new String[numberOfStudents];
        char [] grades = new char[numberOfStudents];

        for(int x = 0; x < numberOfStudents; x++)  {
            System.out.print((x + 1) + "번 째 학생의 이름 :  ");
            nameOfStudents[x] = sc.next();
            System.out.print((x + 1) + "번 째 학생의 점수 :  ");
            scores[x] = sc.nextInt();
        }

        for (int y = 0; y < scores.length; y++) {
            int score = scores[y];
            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            grades[y] = grade;
        }

        for(int z = 0; z< numberOfStudents; z++) {
            System.out.println(nameOfStudents[z] + "학생은 " + scores[z] + "점으로, 등급은 " + grades[z] + "입니다.");
        }
    }
}

