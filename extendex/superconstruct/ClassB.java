package example.extendex.superconstruct;

public class ClassB extends ClassA{

    public ClassB(int a) {
        this(a, 200); // 자신의 다른 생성자 호출 가능
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); // ClassA 기본 생성자는 생략 가능 // 생성자는 무조건 한 번은 부모 생성자 호출을 해줘야 한다.
        System.out.println("ClassB 생성자 a = " + a + " b = " + b);
    }
}
