package example.polymorphsim.ocp;

public class CarMain {

    public static void main(String[] args) {

        Driver driver = new Driver();

        // 차량 선택 (K3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // 차량 변경 (K3 -> GenesisG80)
        GenesisG80 genesisG80 = new GenesisG80();
        driver.setCar(genesisG80);
        driver.drive();

        // 차량 변경 (GenesisG80 -> Sonata)
        Sonata sonata = new Sonata();
        driver.setCar(sonata);
        driver.drive();
    }
}
