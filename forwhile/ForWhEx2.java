package example.forwhile;

public class ForWhEx2 {

    public static void main(String[] args) {

        int num = 2;
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num);
            num += 2;
        }

        num = 2; // while문 쓰기 위해서 num 값 초기화
        while(num <= 20)
        {
            System.out.println(num);
            num +=2;
        }
    }
}
