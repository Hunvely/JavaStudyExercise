package example.forwhile;

public class FoWhEx1 {

    public static void main(String[] args) {

        int count;
        for(count = 1; count <=10; count++)
        {
            System.out.println(count);
        }
        count = 1; // while문 쓰기 위해서 count 초기화
        while(count <= 10)
        {
            System.out.println(count);
            count++;
        }
    }
}
