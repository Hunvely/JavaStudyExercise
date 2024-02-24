package example.polymorphsim.multiple_implementation;

// 인터페이스는 다중 구현 가능함.
public class ClassC implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("ClassC.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("ClassC.methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("ClassC.methodCommon");
    }
}
