package example.polymorphsim.polyanimal;

public class AnimalPolyMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    // 동물들의 타입을 맞추는 메서드
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        // 다형적 참조, 메서드 오버라이딩으로 동물 소리 출력 가능
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
