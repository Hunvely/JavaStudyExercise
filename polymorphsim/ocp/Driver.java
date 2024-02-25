package example.polymorphsim.ocp;

// 다형성으로 새로운 자동차를 추가해도 변하지 않는 코드
public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다 : " + car );
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
