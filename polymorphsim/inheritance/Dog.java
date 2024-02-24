package example.polymorphsim.inheritance;

public class Dog extends AbstractAnimal{

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
