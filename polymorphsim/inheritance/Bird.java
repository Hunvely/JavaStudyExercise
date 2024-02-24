package example.polymorphsim.inheritance;

// extends를 통한 상속은 하나만 할 수 있고, implements를 통한 인터페이스는 다중 구현 할 수 있기 때문에 extends가 먼저 나와야 함.
public class Bird extends AbstractAnimal implements Fly{

    @Override
    public void sound() {
        System.out.println("짹쨱");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
