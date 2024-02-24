package example.polymorphsim.polyanimal;

public class AnimalPolyMain2 {

    public static void main(String[] args) {

        // 다형적 참조 덕분에 동물 타입을 부모 타입으로 맞추었음.
        Animal[] animalArr = {new Dog(),new Caw(), new Cat()};

        for (Animal animal : animalArr) {
            animalSound(animal);
        }
    }

    private static void animalSound(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");

    }

}
