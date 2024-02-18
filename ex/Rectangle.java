package example.ex;

public class Rectangle {

    int width;
    int height;

    int calculateArea() {
        System.out.println("사각형의 넓이는 " + (width * height) + "입니다.");
       return width * height;
    }

    int calculatePerimeter() {
        System.out.println("사각형의 둘레는 " + (2 * (width + height)) + "입니다.");

        return 2 * (width + height);
    }

    boolean isSquare() {
        System.out.println("정사각형 여부 : " + (width == height));
        return width == height;
    }
}
