package example.polymorphsim.multiple_implementation;

public class MainD {

    public static void main(String[] args) {

        InterfaceA a = new ClassC();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new ClassC();
        b.methodB();
        b.methodCommon();
    }
}
