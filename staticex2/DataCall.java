package example.staticex2;

public class DataCall {

    public static void main(String[] args) {

        System.out.println("1. static 호출");
        Data.staticCall();

        System.out.println("2. instance 호출");
        Data data = new Data();
        data.instanceCall();

        System.out.println("3. static 호출2");
        Data.staticCall();

        System.out.println("4. instance 호출2");
        Data data2 = new Data();
        data2.instanceCall(); // 인스턴스를 다시 생성했기 때문에 값이 초기화 되었음.

        System.out.println("5. static 호출3");
        Data.staticCall();

        System.out.println("6. instance 호출3");
        Data data3 = new Data();
        data3.instanceCall();

        // 인스턴스를 통해 접근 가능하지만 추천하지 않음. 인스턴스를 통해 접근하면 힙 영역에서 static 영역으로 돌려 보냄.
        Data data4 = new Data();
        data4.staticCall();

        // 클래스를 통한 접근
        Data.staticCall();


    }
}
