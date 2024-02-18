package example.forwhile;

public class ForWhEx3 {

    public static void main(String[] args) {

        int max = 10;
        int i = 1;
        int sum = 0;

        System.out.println("//max = " + max);

        for(i= 1; i <= max; i++)
        {
            sum += i;
        }
        System.out.println(sum);

        int max2 = 5;
        int j = 1;
        int sum2 = 0;

        while(j <= max2)
        {
            sum2 += j;
            j++;
        }
        System.out.println("//max2 = " + max2);
        System.out.println(sum2);
    }
}
