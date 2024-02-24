package example.polymorphsim.basic;

public class CastingMain2 {

    public static void main(String[] args) {

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();

        // 캐스팅을 해도 Parent poly의 타입이 변하는 것은 아님. 참조값을 복사해서 대입하는 것임.
        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간에만 다운캐스팅
        ((Child) poly).childMethod();
    }
}
