package example.polymorphsim.pureabstractanimal;

// 순수 추상 클래스는 실행 로직이 없다. 다형성을 위해 부모 타입으로써 껍데기 역할만 수행할 뿐이다.
public abstract class AbstractAnimal {

    // 추상메서드가 존재하면 상속 받는 자식 클래스에서 반드시 오버라이딩 해서 구현해야 한다.
    // 순수 추상 클래스를 상속시 자식클래스에서 모든 메서드를 오버라이딩 해야 한다.
    public abstract void sound();
    public abstract void move();

}
