package example.extendex.overriding;

public class HydrogenCar extends Car {

    @Override
    public void move() {
        System.out.println("수소차가 이동합니다.");
    }

    public void fillHydeogen() {
        System.out.println("차에 수소를 충전합니다.");
    }
}
