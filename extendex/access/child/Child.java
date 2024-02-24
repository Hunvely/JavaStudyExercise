package example.extendex.access.child;

import example.extendex.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // protected 접근 제어자는 상속 관계 or 같은 패키지에서 호출 가능하다.
        // defaultValue = 1; // 다른 패키지에서 접근 불가하기 때문에 컴파일 오류
        // privateValue = 1; // private 모든 외부 호출을 막기 때문에 접근 불가하다.

        publicMethod();
        protectedMethod();
        // defaultMethod();
        // privateMethod();
        printParent();
    }
}
