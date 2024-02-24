package example.polymorphsim.basic;

public class CastingMain5 {

    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // instanceof 를 사용해서 원하는 타입으로 변경이 가능한지 확인
        // instanceof 오른쪽에 있는 타입에 왼쪽에 있는 인스턴스의 타입이 들어갈 수 있는지 대입한다. 가능하면 true, 불가능하면 false.
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스가 맞다.");
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스가 아니다.");
        }
    }
}
