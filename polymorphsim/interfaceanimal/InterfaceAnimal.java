package example.polymorphsim.interfaceanimal;

public interface InterfaceAnimal {

    // 인터페이스를 구현한 클래스에서는 인터페이스의 모든 메서드를 오버라이딩 해서 구현해야 한다. 순수 추상 클래스와 비슷함.
    public abstract void sound(); // public abstract 생략 가능, 생략 권장
    void move();

    // 인터페이스는 실행 가능한 메서드를 일반적으로 선언할 수 없는 제약을 가진다. default 메서드나 private 메서드를 이용하면 가능하긴 함.
    /*void happy(){
        System.out.println("동물이 행복해 합니다.");
    }*/
}
