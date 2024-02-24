package example.polymorphsim.pureabstractanimal;

public class AbstractMain {

    public static void main(String[] args) {

        // 추상클래스는 인스턴스 생성 불가
        // AbstractAnimal animal = new AbstractAnimal() {}

        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(caw);
        soundAnimal(cat);

        moveAninal(dog);
        moveAninal(caw);
        moveAninal(cat);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void moveAninal(AbstractAnimal animal) {
        System.out.println("동물 움직임 테스트 시작");
        animal.move();
        System.out.println("동물 움직임 테스트 종료");
    }
}

