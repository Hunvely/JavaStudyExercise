package example.polymorphsim.interfaceanimal;

public class Caw implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소가 움직입니다.");
    }
}
