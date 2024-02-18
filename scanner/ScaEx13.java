package example.scanner;

import jdk.jshell.spi.SPIResolutionException;

import java.util.Scanner;

public class ScaEx13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int price = 0;
        int totalPrice = 0;
        int quantity = 0;

        while (true){

            System.out.println("1 : 상품 입력, 2 : 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1){
                System.out.print("상품명을 입력하세요 : ");
                String name = scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요 : ");
                price = scanner.nextInt();
                System.out.print("구매 수량을 입력하세요 : ");
                quantity = scanner.nextInt();
                totalPrice += price * quantity;
                System.out.println("상품명 : " + name + " 가격 : " + price + " 수량 : " + quantity + " 총 합계 : " + totalPrice);

            }
            else if(option == 2){

                System.out.println("총 비용 : " + totalPrice);
                totalPrice = 0;
            }
            else if(option == 3){
                System.out.println("프로그램 종료");
                break;
            }
            else {
                System.out.println("올바른 옵션을 선택하세요");
            }
        }
    }
}
