package example.polymorphsim.pureabstractanimal;

public class Caw extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소가 움직입니다.");
    }
}
