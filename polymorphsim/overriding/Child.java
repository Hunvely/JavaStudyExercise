package example.polymorphsim.overriding;

public class Child extends Parent{

    public String value = "Child";

    // 오버라아딩 된 메서드는 항상 우선권을 가진다.(중요)
    @Override
    public void Method() {
        System.out.println("Child.method");
    }
}
