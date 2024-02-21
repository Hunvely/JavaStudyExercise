package example.staticex2;

public class Data {

    private int istanceValue;
    private static int staticValue;

    public void instanceCall() {
        istanceValue++; // 인스턴스 변수 접근
        istanceMethod(); // 인스턴스 메서드 접근

        staticValue++;
        staticCall();
    }
    public static void staticCall(){
        // static 영역에서 참조값을 알 수 없기 때문에 인스턴스에 접근할 수 없음.
        // instanceValuie++; 인스턴스 변수 접근하면 컴파일 에러
        // instanceMethod(); 인스턴스 메서드 접근하면 컴파일 에러
        staticValue++; // static 변수 접근
        staticMethod(); // static 메서드 접근
    }

    public static void staticCall2(Data data) {
        // 외부에서 참조값을 넘겨 오기 때문에 static 메서드에서도 인스턴스에 접근 가능함. 즉 참조값을 통해서는 다 접근 가능함.
        data.istanceValue++;
        data.instanceCall();
    }


    private void istanceMethod() {
        System.out.println("instanceValue = " + istanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
