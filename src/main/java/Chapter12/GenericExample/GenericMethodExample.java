package Chapter12.GenericExample;

import java.util.Collection;
import java.util.Collections;

class myBox<T> {

    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

class A {
    public String toString() {
        return "A";
    }
}

class B extends A {

    public String toString() {
        return "B";
    }
}

class C extends A {

    public String toString() {
        return "B";
    }
}


class Sample<T> {

//    1. 밑에 건 안됨
//    static T item;

//    2. static 메소드에 아래와 같이 쓰면 에러임
//     - 클래스가 인스턴스화 되기 전에 메모리에 올라가는 T의 타입 정해지지 않았음
//    static T letMeIn(T item) {
//        return item;
//
//    }


    //   인스턴스 변수의 T
    T item;

    //    3. staic 메소드에 제네릭 타입을 적용하려면 아래와 같이 써야 된다고 한다.
//    - 호출 시에 매개변수 타입을 지정하기 떄문에 가능
//     - 지역변수의 T
    static <T> T letMein(T value) {
        return value;
    }

    void setItem(T item) {
        this.item = item;
    }

    T showT() {
        return item;
    }
}

interface List<E> extends Collection<E> {
    boolean add(E e);
}


public class GenericMethodExample {
    public static void main(String[] args) {

        Sample<String> s = new Sample<String>();
        s.setItem("Hello");
        System.out.println(s.showT());

//       제네릭 메소드 호출
        System.out.println(Sample.<Integer>letMein(1));

//        System.out.println(Sample.<Integer>letMein("Hello"));


    }
}
