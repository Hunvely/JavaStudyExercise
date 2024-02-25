package example.polymorphsim.ocp;

public class GenesisG80 implements Car {

    @Override
    public void startEngine() {
        System.out.println("GenesisG80.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("GenesisG80.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("GenesisG80.pressAccelerator");
    }
}
