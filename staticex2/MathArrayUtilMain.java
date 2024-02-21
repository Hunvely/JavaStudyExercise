package example.staticex2;


import static example.staticex2.MathArrayUtils.*; // static 메서드 뿐만 아니라 static 변수에도 사용 가능함.

public class MathArrayUtilMain {

    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + sum(values));
        System.out.println("average=" + avg(values));
        System.out.println("min=" + min(values));
        System.out.println("max=" + max(values));
    }
}
