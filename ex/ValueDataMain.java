package example;

public class ValueDataMain {
    public static void main(String[] args) {

        ValueData data = new ValueData();

        add(data);
        add(data);
        add(data);
        System.out.println("최종 숫자는 : " + data.value);
    }

    static void add(ValueData data){
        data.value++;
        System.out.println("숫자 증가 value = " + data.value);
    }
}
