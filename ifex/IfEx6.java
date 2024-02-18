package example;

public class IfEx6 {

    public static void main(String[] args) {

        int x = 6;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x의 값 : " + x + " , " + result);
    }
}
