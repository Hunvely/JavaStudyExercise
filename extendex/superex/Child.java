package example.extendex.superex;

public class Child extends Parent {

    public String value = "Child";

    @Override
    public void hello() {
        System.out.println("Child.hello~");
    }

    public void call() {
        System.out.println("this value = " + this.value); // this는 현재 내 타입에서 찾는다. 즉 자기 자신에 대한 참조
        System.out.println("super value = " + super.value); // super는 내 부모 타입에서 찾는다. 즉 부모 클래스에 대한 참조

        this.hello();
        super.hello();
    }
}
