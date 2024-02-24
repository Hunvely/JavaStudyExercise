package example.polymorphsim.basic;

public class CastingMain1 {

    public static void main(String[] args) {

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();

        // 다운캐스팅(부모의 타입 -> 자식 타입으로 변경)
        // 캐스팅을 해도 Parent poly의 타입이 변하는 것은 아님. 참조값을 복사해서 대입하는 것임.
        Child polyParent = (Child) poly;
        polyParent.childMethod();
    }
}
