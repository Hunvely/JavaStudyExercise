package example.ifex;

public class IfEx2 {

    public static void main(String[] args) {

        int distance = 120;

            if(distance >= 100)
                System.out.println("airplane");
            else if(distance <= 100)
                System.out.println("car");
            else if(distance <= 10)
                System.out.println("bike");
            else if(distance <= 1)
                System.out.println("도보");

    }
}
