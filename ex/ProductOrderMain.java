package example;

public class ProductOrderMain {

    public static void main(String[] args) {

        ProductOrder[] info = new ProductOrder[3];
        int totalPrice = 0;

        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;
        info[0] = product1;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.quantity = 1;
        info[1] = product2;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1500;
        product3.quantity = 2;
        info[2] = product3;

        for (ProductOrder productOrder : info) {
            System.out.println("상품명 : " + productOrder.productName + ", 가격 : " + productOrder.price + ", 수량 : " + productOrder.quantity);
            totalPrice += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제 금액 : " + totalPrice);

    }
}
