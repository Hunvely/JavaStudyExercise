package example.method;

public class MethodEx3 {
    public static void main(String[] args) {

        int balance = 10000; // 원금

        balance = depositAMount(balance, 500);
        balance = withdrawAmount(balance, 5600);
        balance = withdrawAmount(balance, 4500);
        balance = withdrawAmount(balance, 500);

        System.out.println("최종 잔액 : " + balance + "원");

    }

    public  static int depositAMount(int x, int y){
        x += y;
        System.out.println(y + "원을 입금하였습니다. 현재 잔액 : " + x + "원");
        System.out.println("-----------------------");
        return x;
    }

    public static int withdrawAmount(int x, int y){

        if(x >= y) {
            x -= y;
            System.out.println(y + "원을 출금하였습니다. 현재 잔액 : " + x + "원");
            System.out.println("-----------------------");
        }
        else {
            System.out.println(y + "원을 인출하려 했으나 잔액이 부족합니다.");
            System.out.println("-----------------------");
        }
        return x;
    }
}
