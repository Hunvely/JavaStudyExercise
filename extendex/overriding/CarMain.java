package example.extendex.overriding;


import example.extendex.carex.GasCar;

public class CarMain {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        example.extendex.carex.GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fullUp();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydeogen();
    }
}
