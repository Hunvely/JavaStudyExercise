package example.method;

public class MethodEx2 {
    public static void main(String[] args) {

        String message = "Hello World!";

        printMessage(message, 3);
        printMessage(message, 5);

    }

    public static void printMessage(String message, int times){
        for(int i = 0; i < times; i++){
            System.out.println(message);
        }
        System.out.println("-----------------");
    }

}
