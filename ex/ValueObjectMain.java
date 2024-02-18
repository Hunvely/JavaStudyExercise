package example;

public class ValueObjectMain {
    public static void main(String[] args) {

        ValueData valueObject = new ValueData();
        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println("최종 value = " + valueObject.value);
    }
}
