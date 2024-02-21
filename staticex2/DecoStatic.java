package example.staticex2;

public class DecoStatic {

    public static void main(String[] args) {

        String s = "hello java";
        String deco = DecoUtilStatic.deco(s); // 클래스 메서드는 인스턴스를 생성하지 않고 바로 클래스에 접근 가능함.

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}
