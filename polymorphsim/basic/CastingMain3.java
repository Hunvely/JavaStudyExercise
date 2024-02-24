package example.polymorphsim.basic;

// 업캐스팅 vs 다운캐스팅
public class CastingMain3 {

    public static void main(String[] args) {


        Child child = new Child();
        // 부모 타입은 자식 타입을 담을 수 있다.
        Parent parent1 = (Parent) child; // 업캐스팅은 생략 가능함. 생략을 권장함.
        Parent parent2 = child; // 업캐스팅 생략


        parent1.parentMethod();
        parent2.parentMethod();
    }
}