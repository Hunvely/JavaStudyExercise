package example.polymorphsim.basic;

public class Polymorphism {

    public static void main(String[] args) {

        // 부모 타입의 변수가 부모 인스턴스 참조
        System.out.println("Parent --> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println();

        // 자식 타입의 변수가 부모 인스턴스, 자식 인스턴스 참조
        System.out.println("Child --> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        System.out.println();

        // 부모 타입의 변수가 자식 인스턴스 참조(다형적 참조), 자식 타입의 변수가 부모 타입을 참조할 수 없음.
        // 부모 타입은 자신은 물론이고 자신의 모든 자식 타입을 참조할 수 있다.
        System.out.println("Parent --> Child");
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod(); // 자식 타입의 기능은 호출할 수 없음. 상속 관계는 부모 방향으로 찾아 올라가는 것만 가능하기 때문이다.
    }
}
