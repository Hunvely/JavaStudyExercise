package example;

import java.util.Scanner;

public class RectangleOopMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Rectangle square = new Rectangle();

        System.out.print("사각형의 가로 길이를 입력하세요 : ");
        int width = input.nextInt();

        System.out.print("사각형의 세로 길이를 입력하세요 : ");
        int height = input.nextInt();

        //입력 받은 값 객체에 넣기
        square.width = width;
        square.height = height;

        square.calculateArea();

        square.calculatePerimeter();

        square.isSquare();

    }
}
