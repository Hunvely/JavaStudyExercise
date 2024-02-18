package example.access.b;

import example.access.a.PublicClass;

public class PublicClassOuter {
    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();

        //dafault 접근 제어자 다른 패키지 접근 불가
        //DefaultClass1 defaultClass1 = new DefaultClass1();
        //DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
