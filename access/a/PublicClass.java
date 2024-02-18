package example.access.a;

//public class는 하나의 자바 파일에 하나만 존재한다.
public class PublicClass {
    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();
        DefaultClass defaultClass = new DefaultClass();
        DefaultClass2 defaultClass2 = new DefaultClass2();

    }
}

//같은 패키지에서 default 접근 제어자 접근 가능
class DefaultClass {

}

class DefaultClass2 {

}