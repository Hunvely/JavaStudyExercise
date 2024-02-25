package example.polymorphsim.ex.afterpay;

public class DefaultPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
