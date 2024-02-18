package example.scanner;

import java.util.Scanner;

public class ScaEx11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 이름을 입력하세요 (-1을 입력하면 종료) : ");
            String name = scanner.nextLine();
            if (name.equals("-1")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            System.out.print("상품의 가격을 입력하세요 : ");
            int price = scanner.nextInt();

            System.out.print("구매하려는 수량을 입력하세요 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            int totalPrice = price * quantity;
            System.out.println("총 비용 : " + totalPrice + "원입니다.");
        }
    }
}
