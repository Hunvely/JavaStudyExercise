package example.extendex.carex;


public class CarMain {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.openDoor();
        electricCar.closeDoor();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.openDoor();
        gasCar.closeDoor();
        gasCar.move();
        gasCar.fullUp();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.openDoor();
        hydrogenCar.closeDoor();
        hydrogenCar.move();
        hydrogenCar.fillHydeogen();
    }
}
