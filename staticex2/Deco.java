package example.staticex2;

public class Deco {

    public static void main(String[] args) {

        String s = "hello java";
        DecoUtil decoUtil = new DecoUtil();
        String deco = decoUtil.deco(s);

        DecoUtil decoUti2 = new DecoUtil(); // 인스턴스 변수가 없고 기능만 있기 때문에 굳이 인스턴스를 생성할 필요가 없음.
        String deco2 = decoUtil.deco(s);

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}
