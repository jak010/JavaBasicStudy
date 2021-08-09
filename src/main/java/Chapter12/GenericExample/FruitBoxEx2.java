package Chapter12.GenericExample;

import java.util.ArrayList;

// Eatable 정의
interface Eatable {
};

// Generic 클래스 정의
class Box2<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}


// 1.
// - 제네릭 타입에 extends 를 사용하면 특정 타입의 자손들만 대입할 수 있게 제한 가능 
// - interface를 상속받지만 implements가 아닌 extends 임
// <T extends Fruit & Eatable>는 `Fruit의 자손이면서 Eatable 인터페이스도 구현해라` 라는 의미임
class FruitBox2<T extends Fruit2 & Eatable> extends Box2<T> {
}

class Fruit2 implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple2 extends Fruit2 {

    public String toString() {
        return "Apple2";
    }
}

class Grape2 extends Fruit2 {

    public String toString() {
        return "Grape2";
    }
}

class Toy2 {

    public String toString() {
        return "Toy2";
    }
}

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitbox = new FruitBox2<Fruit2>();
        FruitBox2<Apple2> applebox = new FruitBox2<Apple2>();
        FruitBox2<Grape2> grapebox = new FruitBox2<Grape2>();

//        FruitBox2<Grape> grapebox2 = new FruitBox2<Apple2>(); --> 에러 타입 불일치
//        FruitBox2<Toy2> toybox = new FruitBox2<Toy2>(); --> 에러 Fruit2의 자손들만 가능

        fruitbox.add(new Fruit2());
        fruitbox.add(new Apple2());
        fruitbox.add(new Grape2());

        applebox.add(new Apple2());
//        applebox.add(new Grape2()); // --> Grape 는 Apple의 자손이 아님




    }
}
