package example.polymorphsim.ex.afterpay;

public abstract class PayStore {

    // 결제 수단을 추가할 때 변하는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("shinhan")) {
            return new ShinhanPay();
        } else {
            return new DefaultPay();
        }
    }
}
