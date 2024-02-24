package example.polymorphsim.interfaceanimal;

public class InterfaceAnimalMain {

    public static void main(String[] args) {

        // 인터페이스는 인스턴스 생성 불가
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        moveAnimal(dog);

        soundAnimal(cat);
        moveAnimal(cat);

        soundAnimal(caw);
        moveAnimal(caw);

    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 움직임 테스트 시작");
        animal.move();
        System.out.println("동물 움직임 테스트 종료");
    }
}
