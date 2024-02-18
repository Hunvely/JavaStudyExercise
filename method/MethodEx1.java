package example;

public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        average(a, b, c);

        int x = 15;
        int y = 25;
        int z = 35;

        average(x, y, z);


    }
    public static double average(int a, int b, int c)
    {
        int sum = a + b + c;
        double avg = sum / 3.0;
        System.out.println("평균 값 : " + avg);
        return avg;
    }

}
