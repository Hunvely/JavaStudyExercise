package example.array;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxProducts = 10;

        String[] productName = new String[maxProducts];
        int[] productPrice = new int[maxProducts];
        int productCount = 0;

        while (true){
            System.out.print("1. 상품 등록  |  2. 상품 목록  |  3. 종료\n메뉴를 선택하세요 : ");
            int menu = input.nextInt();
            input.nextLine(); // nextInt은 숫자만 읽고 \n을 냅두기 때문에 'input.nextLine()' 을 통해 개행문자를 잡아줌.

            if(menu == 1){

                if(productCount > maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품의 이름을 입력하세요 : ");
                productName[productCount] = input.nextLine(); // productCount 변수 0으로 초기화 해놓고 0번째 인덱스부터 등록되도록 설정

                System.out.print("상품의 가격을 입력하세요 : ");
                productPrice[productCount] = input.nextInt(); // productCount 변수 0으로 초기화 해놓고 0번째 인덱스부터 등록되도록 설정

                productCount++; // 상품 등록 개수의 제한이 10개이므로 상품 등록할 때마다 카운팅
            }
            else if(menu == 2){
                if(productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productName[i] + " : " + productPrice[i] + "원");
                }
            }
            else if(menu == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else
                System.out.println("올바른 메뉴를 선택하십시오");
        }
    }
}

